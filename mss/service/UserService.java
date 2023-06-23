package com.mss.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
import com.mss.repository.UserRepository;
import com.mss.user.Users;
 
 
 

@Service
public class UserService {
@Autowired
UserRepository ur;
 
public String pUpdate(String email, String nPassword) {
    try {
        Optional<Users> d = ur.findByEmail(email);

        if (d.isPresent()) {
            Users details = d.get();
            details.setPassword(nPassword);
            ur.save(details);
            return "Success"; // Successful update
        } else {
            return "User not found"; // User not found
        }
    } catch (Exception e) {
        return "Exception occurred: " + e.getMessage(); // Exception occurred
    }
}
 
}

 
