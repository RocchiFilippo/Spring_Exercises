package com.example.Spring_Develhope_Exercise.controller;

import com.example.Spring_Develhope_Exercise.Model.Meal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//Exercise 2.2
@RestController
public class GetVariableMealNameController {
    private List<Meal> meals = Arrays.asList(
            new Meal("carne", "Piatto di carne", 4.50),
            new Meal("pesce", "Piatto di pesce", 3.50),
            new Meal("vegano", "Piatto di verdure", 2.70)
    );

    @GetMapping("/meal/{name}")
    public ResponseEntity<?> mealName(@PathVariable ("name") String mealName) {

        for (Meal meal : meals){
            if(meal.getName().equals(mealName)){
                return ResponseEntity.ok(meal);
            }
        }
        return ResponseEntity.badRequest().body("scegli uno tra carne, pesce e vegano");
    }
}