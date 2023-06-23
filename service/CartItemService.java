package com.example.finalJpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finalJpa.repository.CartItemRepository;
import com.example.finalJpa.repository.ProductRepository;
import com.example.finalJpa.repository.UserRepository;
import com.example.finalJpa.user.CartItem;
import com.example.finalJpa.user.CartRequest;
import com.example.finalJpa.user.Product;
import com.example.finalJpa.user.User;

@Service
public class CartItemService {

	 
	@Autowired
	private CartItemRepository cartRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private UserRepository userRepository;

	public CartItem addToCart(CartRequest cr) {
		Product product = productRepository.findById(cr.getProductId());
		 
		User user = userRepository.findByEmail(cr.getUserId());

		if (product != null && user != null) {
			CartItem cart = new CartItem();
			cart.setUser(user);
			cart.setProduct(product);
			cart.setQuantity(cr.getQuantity());
		
			 
			return cartRepository.save(cart);
		}

		return null;
}
	 
 
}