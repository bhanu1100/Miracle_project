package com.example.finalJpa.service;

 
 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.finalJpa.repository.ContactRepository;
import com.example.finalJpa.user.Contact;

 
@Service

public class Contactservice {

@Autowired

ContactRepository contactrepository;

public Contact createcontact(Contact c) {

return contactrepository.save(c);

}

public List<Contact> findcontact() {

return contactrepository.findAll();

}

}
