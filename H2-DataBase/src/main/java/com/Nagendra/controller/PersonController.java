package com.Nagendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nagendra.entity.Person;
import com.Nagendra.service.PersonService;

@RestController
@RequestMapping("/person-details")
public class PersonController {
@Autowired
PersonService personService;
@PostMapping("/person")
private int savePerson(@RequestBody Person p) {
	personService.saveOrUpdate(p);
	return p.getId();
}
}
