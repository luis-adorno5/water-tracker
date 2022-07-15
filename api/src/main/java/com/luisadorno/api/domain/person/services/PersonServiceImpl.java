package com.luisadorno.api.domain.person.services;

import com.luisadorno.api.domain.core.exceptions.ResourceNotFoundException;
import com.luisadorno.api.domain.person.model.Person;
import com.luisadorno.api.domain.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonServiceImpl implements PersonService{

    PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person create(Person person) {
        return null;
    }

    @Override
    public Person getPersonById(Long id) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public List<Person> getAllPeople() {
        return null;
    }

    @Override
    public List<Person> getByLastName(String lastName) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Person update(Long id, Person person) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public void deletePerson(Long id) throws ResourceNotFoundException {

    }
}
