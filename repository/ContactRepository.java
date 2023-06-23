package com.example.finalJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.finalJpa.user.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer>{

}