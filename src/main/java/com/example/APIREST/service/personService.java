package com.example.APIREST.service;

import com.example.APIREST.Model.Person;
import com.example.APIREST.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class personService {

@Autowired
    private PersonRepository repository;

@Transactional
    public Person SavePerson(String name, String userName, Date date) {
    Person person = new Person();
    person.setName(name);
    person.setUserName(userName);
    person.setDate(date);

    return repository.save(person);
}
    public Person Update(long id,String name,String userName,Date date)throws Exception{
    validator(name,userName,date);
    Person person= repository.getById(id);

    if(person==null){
        throw new Exception("the person is not found in the database");
    }
    person.setName(name);
    person.setUserName(userName);
    person.setDate(date);

    return repository.save(person);
}

    @Transactional
    public Person getOne(Long id){
        return repository.getOne(id);
    }

    @Transactional
    public void deletePerson(long id){
    Person person= repository.getOne(id);
    repository.delete(person);
    }

    @Transactional
    public List<Person>PersonList(){
        return repository.findAll();
    }


public void validator(String name,String userName, Date date) throws Exception {
    if (name== null || name.isEmpty()){
        throw new Exception("Enter your name");
    }
    if(userName==null || userName.isEmpty()){
        throw new Exception("Enter your username");
    }
    if(date==null){
        throw new Exception("Enter your date");
    }
}

}


