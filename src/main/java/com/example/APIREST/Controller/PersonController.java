package com.example.APIREST.Controller;

import com.example.APIREST.Model.Person;
import com.example.APIREST.service.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private personService personService;

    @GetMapping("/Persons")
    public List<Person> allPersons() {
        return personService.PersonList();
    }

    @PostMapping("/person")
    public Person createPerson(@RequestBody String name, @RequestBody String userName,@RequestBody Date date) throws Exception {
        return personService.SavePerson(name, userName, date);
    }
}


