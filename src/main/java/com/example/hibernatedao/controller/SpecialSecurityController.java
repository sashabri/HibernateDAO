package com.example.hibernatedao.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@RequestMapping("/")
public class SpecialSecurityController {

    @RolesAllowed("ROLE_READ")
    @GetMapping("read")
    public String read() {
        return "You can read!";
    }

    @Secured({"ROLE_WRITE"})
    @GetMapping("write")
    public String write() {
        return "You can write!";
    }

    @PreAuthorize("hasAnyRole('ROLE_WRITE', 'ROLE_DELETE')")
    @GetMapping("editor")
    public String editor() {
        return "You can edit!";
    }

    @PreAuthorize("#username == authentication.principal.username")
    @GetMapping("hello")
    public String hello(@RequestParam String username) {
        return "Привет, я знаю твоё имя - " + username;
    }
}
