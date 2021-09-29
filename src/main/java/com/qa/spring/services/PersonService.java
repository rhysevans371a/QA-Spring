package com.qa.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.spring.domain.Person;
import com.qa.spring.repo.PersonRepo;


@Service
public class PersonService {
	private PersonRepo repo;
    public PersonService(PersonRepo repo) {
        super();
        this.repo = repo;
    }
    private List<Person> people = new ArrayList<>();

    public Person addPerson(Person person) {
        // Add new Person
    	return this.repo.save(person);
        // Return last added Person from List
        //return this.people.get(this.people.size() - 1);
    }

    public List<Person> getAllPeople() {
        // Return the whole List
    	return this.repo.findAll();
    }

    public Person updatePerson(Long id, Person newPerson) {
    	java.util.Optional<Person> existingOptional = this.repo.findById(id);
        Person existing = existingOptional.get();

        existing.setFirstName(newPerson.getFirstName());
        existing.setLastName(newPerson.getLastName());

        return this.repo.save(existing);
    }

    public boolean removePerson(Long id) {
        // removes the entity
        this.repo.deleteById(id);
        // checks to see if it still exists
        boolean exists = this.repo.existsById(id);
        // returns true if entity no longer exists
        return !exists;
    }
}
