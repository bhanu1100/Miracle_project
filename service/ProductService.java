package com.example.finalJpa.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finalJpa.repository.ProductRepository;
import com.example.finalJpa.user.Product;

@Service

public class ProductService {
	@Autowired 
ProductRepository productrepository; 
	public Product add(Product p)
	{
	  return productrepository.save(p);	
	}
    
	public List<Product> filter(String category)
	{
	    
	    return productrepository.findAllByCategory(category);
 
	}
	
	public List<Product> display()
	{
		return productrepository.findAll();
	}
}
