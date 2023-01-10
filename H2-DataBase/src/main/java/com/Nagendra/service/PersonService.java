package com.Nagendra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Nagendra.entity.Person;
import com.Nagendra.repository.PersonRepo;
@Service
public class PersonService {
@Autowired
PersonRepo personRepo;
public void saveOrUpdate(Person p) {
personRepo.save(p);}}
