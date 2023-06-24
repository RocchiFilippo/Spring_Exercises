package com.example.Spring_Develhope_Exercise.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Exercise 1.3
@RestController
public class InfoController {
    @GetMapping("/info")
    public ResponseEntity<String> info(){
        return ResponseEntity.ok("This is the info endpoint");
    }
}
