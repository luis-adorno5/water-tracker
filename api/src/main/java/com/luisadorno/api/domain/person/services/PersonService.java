package com.luisadorno.api.domain.person.services;

import com.luisadorno.api.domain.core.exceptions.ResourceCreationException;
import com.luisadorno.api.domain.core.exceptions.ResourceNotFoundException;
import com.luisadorno.api.domain.person.model.Person;

import java.util.List;

public interface PersonService {
    Person create(Person person) throws ResourceCreationException;
    Person getPersonById(Long id) throws ResourceNotFoundException;
    List<Person> getAllPeople();
    List<Person> getByLastName(String lastName) throws ResourceNotFoundException;
    Person update(Long id, Person person) throws ResourceNotFoundException;
    void deletePerson(Long id) throws ResourceNotFoundException;
}
