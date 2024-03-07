package com.SpringBootJDataJPA.runner;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJDataJPA.model.Product;
import com.SpringBootJDataJPA.repo.ProductRepositroy;
@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired
	private ProductRepositroy repo;
	@Override
	public void run(String... args) throws Exception {
		
		//Loading file data
		FileInputStream fis=new FileInputStream("F:\\SpringBoot Videos\\Notes\\margot_robbie.jpg");
		//create byte array with size equal to file size
		byte[] prodImg=new byte[fis.available()];
		//load file data into byte[]
		fis.read(prodImg);
		
		//create length string
		String description="HELLO DUDE, welcome to all, sample data, Spring Boot and MS";
		char[] prodDesc=description.toCharArray();
		repo.save(new Product(101, "BOOK", 500.00, prodImg, prodDesc));
		
		fis.close();
	}

}
