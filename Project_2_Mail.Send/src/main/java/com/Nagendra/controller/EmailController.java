package com.Nagendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Nagendra.Entity.Entity;
import com.Nagendra.Service.EmailService;

@RestController
public class EmailController {
@Autowired
private EmailService emailService;
@PostMapping("/sentMail")
public String sentMail(@RequestBody Entity entity) {
String status=emailService.sendSimpleMail(entity);
return status;}}