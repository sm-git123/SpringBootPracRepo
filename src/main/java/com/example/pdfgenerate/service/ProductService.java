package com.example.pdfgenerate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pdfgenerate.entity.Product;
import com.example.pdfgenerate.repository.ProductRepository;


@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public List<Product> generateExcelReport()
	{
		List<Product> productLst = (List<Product>) productRepository.findAll();
		return productLst;
	}

}
