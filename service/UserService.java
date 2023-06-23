package com.example.finalJpa.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finalJpa.repository.UserRepository;
import com.example.finalJpa.user.User;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public User registerUser(User user) {
		return userRepository.save(user);
	}

	public User loginUser(String email, String password) {
		User user = userRepository.findByEmail(email);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}

//	public String pUpdate(String email, String nPassword) {
//	    try {
//	       User d = userRepository.findById(email);
//
//	        if (d.isPresent()) {
//	            User details = d.get();
//	            details.setPassword(nPassword);
//	            userRepository.save(details);
//	            return "Success"; // Successful update
//	        } else {
//	            return "User not found"; // User not found
//	        }
//	    } catch (Exception e) {
//	        return "Exception occurred: " + e.getMessage(); // Exception occurred
//	    }
//	}
//	public String updateP(String email,String password)
//	{
//		 try {
//		       User details = userRepository.findByEmailId(email,password);
//		    	if(details!=null)	   
//		         {
//		           
//		            details.setPassword(password);
//		            userRepository.save(details);
//		            return "Success"; 
//		        } else {
//		            return "User not found"; // User not found
//		        }
//		    } catch (Exception e) {
//		        return "Exception occurred: " + e.getMessage(); // Exception occurred
//		    }
//	}

}
