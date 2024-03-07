package com.SpringBootJDataJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootJDataJPA.model.Product;

public interface ProductRepositroy extends JpaRepository<Product, Integer>{

}
