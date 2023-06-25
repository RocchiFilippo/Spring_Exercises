package com.example.Spring_Develhope_Exercise.controller;

import com.example.Spring_Develhope_Exercise.Model.Meal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//Exercise 2.1
@RestController
public class AllMealController {
    private List<Meal> meals = Arrays.asList(
            new Meal("Carne","Piatto di carne",4.50),
            new Meal("Pesce","Piatto di pesce",3.50),
            new Meal("Vegano","Piatto di verdure",2.70)
    );
    @GetMapping("/meal")
    public ResponseEntity<List<Meal>> theMeals() {
        return ResponseEntity.ok(meals);
    }
}
