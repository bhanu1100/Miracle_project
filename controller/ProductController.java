package com.example.finalJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.finalJpa.service.ProductService;
import com.example.finalJpa.user.Product;

@RestController
public class ProductController {
	@Autowired
	ProductService productservice;

	@PostMapping("/productinsert")
	public Product Padd(@RequestBody Product p) {
		return productservice.add(p);
	}

	@GetMapping("/productfilter")
	public List<Product> Pget(@RequestParam String category) {
		return productservice.filter(category);
	}

	@GetMapping("/Display")
	public List<Product> Pdisplay() {
		return productservice.display();
	}

}
