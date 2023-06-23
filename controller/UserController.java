package com.example.finalJpa.controller;

import java.util.HashMap;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.finalJpa.service.UserService;
import com.example.finalJpa.user.LoginRequest;
import com.example.finalJpa.user.RequestUpdate;
import com.example.finalJpa.user.User;
 

@CrossOrigin(origins = "*")
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		return userService.registerUser(user);
	}

	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody LoginRequest loginRequest) {
		User user = userService.loginUser(loginRequest.getEmail(), loginRequest.getPassword());
		if (user != null) {
			return ResponseEntity.ok("Login successful");
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
		}
	}
	
//	@PostMapping("/login")
//	public  Map loginUser(@RequestBody LoginRequest loginRequest) {
//		User user = userService.loginUser(loginRequest.getEmail(), loginRequest.getPassword());
//		HashMap hm=new HashMap<>();
//		if (user != null) {
//		      hm.put("success","login successful"); 
//		} else {
//			 hm.put("fail","invalid credentails");
//		}
//		return hm;
//	}
	
//	@PutMapping("/Pupdate")
//	public String passwordupdate(@RequestBody User d) {
//		return userService.pUpdate(d.getEmail(), d.getPassword());
//
//	}
//@PutMapping("/update")
//public String PswdUpdate(@RequestBody RequestUpdate rupdate)
//{
//	return userService.updateP(rupdate.getEmail(),rupdate.getPassword());
//}

}
