package com.luisadorno.api.domain.person.controllers;

import com.luisadorno.api.domain.person.model.Person;
import com.luisadorno.api.domain.person.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person person){
        person = personService.create(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<Person>> getAll(){
        Iterable<Person> people = personService.getAllPeople();
        return new ResponseEntity<>(people, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Person> getById(@PathVariable Long id){
        Person person = personService.getPersonById(id);
        return new ResponseEntity<>(person, HttpStatus.ACCEPTED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody Person person){
        Person updatedPerson = personService.update(id, person);
        return new ResponseEntity<>(updatedPerson, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable Long id){
        personService.deletePerson(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
