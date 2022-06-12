package com.example.APIREST.Controller;

import com.example.APIREST.Model.Person;
import com.example.APIREST.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

@Autowired
private PersonRepository repository;

@GetMapping("/Persons")
public List<Person> allPersons(){
    return repository.findAll();
}

@GetMapping("/Persons/{name}")
public List<Person>finByName(@PathVariable("name")String name){
    return repository.findByName(name);
}
@PostMapping("/person")
public Person createPerson(@RequestBody Person person){
    return repository.save(person);
}
@PutMapping("/person/{id}")
public Person UpdatePerson(@PathVariable("id") Long id, @RequestBody Person person){
    return repository.save(person);
}
}

