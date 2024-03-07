package com.SpringBootJDataJPA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prodtab")
public class Product {
	@Id	
	@Column(name = "pid")
	private Integer prodId;
	@Column(name = "pcode")
	private String prodCode;
	@Column(name = "pcost")
	private Double prodCost;
	@Lob	// byte[] + @Lob = BLOB
	@Column(name = "pimage")
	private byte[] prodImg;
	@Lob	// char[] + @Lob = CLOB
	@Column(name = "pnote")
	private char[] prodDesc;
}
