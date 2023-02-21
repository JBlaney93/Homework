package com.codeclan.filesandfolders.controllers;

import com.codeclan.filesandfolders.models.Person;
import com.codeclan.filesandfolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/persons")
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @GetMapping(value = "/persons/{id}")
    public ResponseEntity getPerson(@PathVariable Long id){
        return new ResponseEntity<>(personRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/persons")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/persons/{id}")
    public void deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
    }

//    @PutMapping(value = "/persons/{id}")
//    public ResponseEntity<Person> updatePerson(@PathVariable Long id){
//        personRepository.
//    }
}
