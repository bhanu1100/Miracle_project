package com.example.finalJpa.controller;





import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.finalJpa.service.Contactservice;
import com.example.finalJpa.user.Contact;

 

@RestController

public class ContactController {

@Autowired

Contactservice contactservice;

@PostMapping("/addcontact")

public Map createUser(@RequestBody Contact c) {
HashMap hm=new HashMap();
 
Contact data= contactservice.createcontact(c);
if(data!=null)
{
	hm.put("success", "Thank You");
}
else
{
	hm.put("fail", "failed");
}
return hm;
}

@GetMapping("/findcontact")

public List<Contact> findcontact() {

return contactservice.findcontact();

}

}


