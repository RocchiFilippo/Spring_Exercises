package com.example.Spring_Develhope_Exercise.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

//Exercise 1.4
@RestController
public class RandomBooleanController {
    @GetMapping("/randomboolean")
    public ResponseEntity<String> randomBoolean(){
        boolean booleano = new Random().nextBoolean();

        if(booleano != true){
            return ResponseEntity.badRequest().body("It's False!");
        }
        return ResponseEntity.ok("It's True!");
    }
}
