//package com.example.finalJpa.controller;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.finalJpa.service.CartService;
//import com.example.finalJpa.user.Cart;
//
////@RestController
////public class CartController {
////	@Autowired
////	CartService cartservice;
////
////	@PostMapping("/add")
////	public Cart addProductToCart(@RequestBody Cart cart) {
//////		Cart cart = cartservice.addCart(cartRequest.getProductId(), cartRequest.getUserId(), cartRequest.getQuantity());
////		cart.setQuantity(1); // Example: Setting quantity to 1
////		cart.setPrice(9.99); // Example: Setting price to 9.99
////		// Add the cart to the service
////		System.out.println(cart.getPrice());
////		System.out.println(cart.getQuantity());
////		System.out.println(cart.getUser());
////		cartservice.addToCart(cart);
////		return null;
////	}
////
////}
