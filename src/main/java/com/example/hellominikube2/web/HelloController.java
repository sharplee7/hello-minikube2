package com.example.hellominikube2.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello/{name}")
    public ResponseEntity<String> hello(@PathVariable String name) throws Exception {
        String greeting = "Hello " + name;
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }
}
