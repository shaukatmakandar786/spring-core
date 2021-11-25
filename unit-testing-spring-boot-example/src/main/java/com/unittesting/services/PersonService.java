package com.unittesting.services;

import com.unittesting.dao.PersonDao;
import com.unittesting.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public List<Person> getAllPerson()
    {
        return personDao.findAll();
    }

    public Person addPerson(Person person)
    {
        return personDao.save(person);
        //return person;
    }
}
