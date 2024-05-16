package com.example.hibernatedao.controller;

import com.example.hibernatedao.repository.DBRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@RequestMapping("/")
public class DAOController {

    DBRepository dbRepository;

    public DAOController(DBRepository dbRepository) {
        this.dbRepository = dbRepository;
    }

    @GetMapping("persons/by-city")
    public Object fetch(@RequestParam String city) {
        return dbRepository.getPersonsByCity(city);
    }
}
