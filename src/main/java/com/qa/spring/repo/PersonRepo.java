package com.qa.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.spring.domain.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

	
}
