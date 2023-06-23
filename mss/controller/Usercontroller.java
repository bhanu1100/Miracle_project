package com.mss.controller;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.loader.custom.NonUniqueDiscoveredSqlAliasException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import com.mss.service.UserService;

import com.mss.user.Users;

@CrossOrigin(origins = "*")

@RestController
public class Usercontroller {
	@Autowired
	UserService us;

	@PutMapping("/Pupdate")
	public String passwordupdate(@RequestBody Users d) {
		return us.pUpdate(d.getEmail(), d.getPassword());

	}

}
