package com.teste.crudspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class hello {

    @RequestMapping("/ola")
    public String hello() {
        return "Ola mundo!";
    }
}
