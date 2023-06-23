package com.example.finalJpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

 
import com.example.finalJpa.user.CartItem;
import com.example.finalJpa.user.Product;

@Repository
public interface  CartItemRepository extends JpaRepository<CartItem,Integer >{
	public Optional<CartItem> findById(int id);

}
