package com.Nagendra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nagendra.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

	

}
