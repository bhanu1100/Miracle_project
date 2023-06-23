package com.example.finalJpa.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.finalJpa.user.User;

 

public interface UserRepository extends JpaRepository< User, Integer> {
 
	User findByEmail(String i);
	 

	User findByEmailAndPassword(String email, String password);

}
