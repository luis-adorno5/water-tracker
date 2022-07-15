package com.luisadorno.api.domain.person.services;

import com.luisadorno.api.domain.core.exceptions.ResourceCreationException;
import com.luisadorno.api.domain.core.exceptions.ResourceNotFoundException;
import com.luisadorno.api.domain.person.model.Person;
import com.luisadorno.api.domain.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService{

    PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person create(Person person) throws ResourceCreationException {
        Optional<Person> personToCreate = personRepository.findByUserName(person.getUserName());
        if(personToCreate.isPresent())
            throw new ResourceCreationException();
        return personRepository.save(person);
    }

    @Override
    public Person getPersonById(Long id) throws ResourceNotFoundException {
        Person person = personRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("User with id: %s not found!", id)));
        return person;
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
