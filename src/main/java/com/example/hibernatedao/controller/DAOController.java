package com.example.hibernatedao.controller;

import com.example.hibernatedao.entity.Man;
import com.example.hibernatedao.entity.Persons;
import com.example.hibernatedao.repository.CustomizedPersonsCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;

@RestController
@Configuration
@RequestMapping("/")
public class DAOController {

    @Autowired
    private CustomizedPersonsCrudRepository customizedPersonsCrudRepository;

    @GetMapping("persons/by-city")
    public Object fetch(@RequestParam String city) {
        return customizedPersonsCrudRepository.findByCityOfLiving(city);
    }

    @DeleteMapping("persons/id")
    public void deletePersons(@RequestBody Man man) {
        customizedPersonsCrudRepository.deleteById(man);
    }

    @PostMapping("persons")
    public void createPersons(@RequestBody Persons persons){
        customizedPersonsCrudRepository.save(persons);
    }

    @GetMapping("persons/id")
    public Object readPersons(@RequestBody Man man) {
        return customizedPersonsCrudRepository.findById(man);
    }

    @GetMapping("persons/age")
    public Object readPersonsByAge(@RequestParam Integer age) {
        return customizedPersonsCrudRepository.findByMan_AgeLessThan(age,Sort.sort(Persons.class));
    }

    @GetMapping("persons/name")
    public Object readPersonsByNameAvdSurname(@RequestParam String name,@RequestParam String surname) {
        return customizedPersonsCrudRepository.findByMan_NameAndMan_Surname(name, surname);
    }

}
