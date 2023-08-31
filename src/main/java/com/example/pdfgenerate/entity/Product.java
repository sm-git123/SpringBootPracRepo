package com.example.pdfgenerate.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_pdf")

public class Product {

	@Id
	@GeneratedValue
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	
	private String name;

	
	private Double price;

	
	private Double salePrice;

	
	private Integer salesCount;


	private String saleDate;






}
