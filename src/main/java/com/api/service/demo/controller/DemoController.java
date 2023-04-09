package com.api.service.demo.controller;

import com.api.service.demo.model.Person;
import com.api.service.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author tobi
 * @Date : 9/4/2023
 * @Time : 8:04 PM
 */
@RestController
@RequestMapping(value = "/api/v1/demo/persons")
public class DemoController {

    @Autowired
    private PersonService service;

    @GetMapping
    public List<Person> getPersons() {
        return service.getPersons();
    }
    @PostMapping
    public Person setPerson(@RequestBody  Person person) {
        return service.setPerson(person);
    }
}
