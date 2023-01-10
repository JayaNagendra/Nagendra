package com.Nagendra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Nagendra.entity.Person;
@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {}
