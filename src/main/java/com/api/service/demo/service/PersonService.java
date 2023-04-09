package com.api.service.demo.service;

import com.api.service.demo.model.Person;
import com.api.service.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tobi
 * @Date : 9/4/2023
 * @Time : 9:24 PM
 * @desc : ...
 */
@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;

    public List<Person> getPersons() {
        return repository.findAll();
    }

    public Person setPerson(Person person) {
        return repository.save(person);
    }
}
