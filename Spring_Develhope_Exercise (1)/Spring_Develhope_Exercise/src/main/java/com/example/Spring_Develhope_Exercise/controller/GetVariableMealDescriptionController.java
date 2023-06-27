package com.example.Spring_Develhope_Exercise.controller;

import com.example.Spring_Develhope_Exercise.model.Meal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//Exercise 2.3
@RestController
public class GetVariableMealDescriptionController {
    private List<Meal> meals = Arrays.asList(
            new Meal("carne", "piatto di carne", 4.50),
            new Meal("pesce", "piatto di pesce", 3.50),
            new Meal("vegano", "piatto di verdure", 2.70)
    );

    @GetMapping("/meal/description/{description}")
    public ResponseEntity<?> mealName(@PathVariable("description") String mealDescription) {

        for (Meal meal : meals){
            if(meal.getDescription().equals(mealDescription)){
                return ResponseEntity.ok(meal);
            }
        }
        return ResponseEntity.badRequest().body("scegli uno tra carne, pesce e vegano");
    }
}
