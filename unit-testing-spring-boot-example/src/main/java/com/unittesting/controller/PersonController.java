package com.unittesting.controller;


import com.unittesting.entity.Person;
import com.unittesting.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person")
    public List<Person> getAllPerson(){

        return personService.getAllPerson();
    }
    // add person
    @PostMapping("/person")
    public Person addPerson(@RequestBody Person person)
    {
        return this.personService.addPerson(person);
    }
}
