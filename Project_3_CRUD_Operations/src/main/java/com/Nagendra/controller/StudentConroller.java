package com.Nagendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Nagendra.entity.Student;
import com.Nagendra.repository.StudentRepo;

@RestController
public class StudentConroller {
	@Autowired
	StudentRepo studentRepo;
	
	@PostMapping("/api/students")
	public int saveStudent(@RequestBody  Student student) {
		studentRepo.save(student);
		return student.getId();
		

}
}
