package com.qa.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.spring.domain.Person;
import com.qa.spring.services.PersonService;
@RequestMapping
@RestController

public class PersonController {
    private PersonService service;

    public PersonController(PersonService service) {
        super();
        this.service = service;
    }
    //private List<Person> people = new ArrayList<>();
    @PostMapping("/create")
    public Person addPerson(@RequestBody Person person) {
        return this.service.addPerson(person);
    }

    @GetMapping("/getAll")
    public List<Person> getAllPeople(@RequestBody Person person) {
        return this.service.getAllPeople();
    }

    @PutMapping("/update")
    public Person updatePerson(@PathParam("id") Long id, @RequestBody Person person) {
        return this.service.updatePerson(id, person);
    }

    @DeleteMapping("/delete/{id}")
    public boolean removePerson(@PathVariable Long id) {
        return this.service.removePerson(id);
    }

}

