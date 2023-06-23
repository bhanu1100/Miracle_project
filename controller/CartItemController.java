package com.example.finalJpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.finalJpa.repository.CartItemRepository;
import com.example.finalJpa.repository.UserRepository;
import com.example.finalJpa.service.CartItemService;
import com.example.finalJpa.user.CartItem;
import com.example.finalJpa.user.CartItemDTO;
import com.example.finalJpa.user.CartRequest;
import com.example.finalJpa.user.Product;
import com.example.finalJpa.user.User;

@RestController
public class CartItemController {

	 
	@Autowired
	CartItemService cartitemservice ;


	@PostMapping("/additem")
    public Product addToCart(@RequestBody CartRequest cart) {
       CartItem items=cartitemservice.addToCart(cart);
       return items.getProduct();
    }


	 
} 

 
