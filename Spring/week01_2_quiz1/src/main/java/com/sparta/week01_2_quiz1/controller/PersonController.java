package com.sparta.week01_2_quiz1.controller;

import com.sparta.week01_2_quiz1.domain.Person;
import com.sparta.week01_2_quiz1.domain.PersonRepository;
import com.sparta.week01_2_quiz1.domain.PersonRequestDto;
import com.sparta.week01_2_quiz1.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequiredArgsConstructor
@RestController
public class PersonController {
    private final PersonRepository personRepository;
    private final PersonService personService;

    public PersonController(PersonRepository personRepository, PersonService personService){
        this.personRepository = personRepository;
        this.personService = personService;
    }

    @GetMapping("/api/persons")
    public List<Person> getPersons() {
        return personRepository.findAll();
    }
    @PostMapping("/api/persons")
    public Person postPersons(@RequestBody PersonRequestDto personRequestDto){
        Person person = new Person(personRequestDto);
        return personRepository.save(person);
    }
    @PutMapping("/api/persons/{id}")
    public Long updatePersons(@PathVariable Long id, @RequestBody PersonRequestDto personRequestDto){
        return personService.update(id, personRequestDto);
    }
    @DeleteMapping("/api/persons/{id}")
    public Long deletePersons(@PathVariable Long id){
        personRepository.deleteById(id);
        return id;
    }
}