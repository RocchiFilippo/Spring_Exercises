package com.example.Spring_Develhope_Exercise.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/good-morning")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Good morning!");
    }

    //Exercise 1.1
    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello World!");
    }

    //Exercise 1.2
    @GetMapping("/greeting")
    public ResponseEntity<String> greeting(){
        return ResponseEntity.ok("Good Afternoon!");
    }
}
