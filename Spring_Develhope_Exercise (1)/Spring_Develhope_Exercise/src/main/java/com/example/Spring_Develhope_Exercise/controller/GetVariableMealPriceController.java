package com.example.Spring_Develhope_Exercise.controller;

import com.example.Spring_Develhope_Exercise.Model.Meal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Exercise 2.4
@RestController
public class GetVariableMealPriceController {
    private List<Meal> meals = Arrays.asList(
            new Meal("carne", "piatto di carne", 4.50),
            new Meal("pesce", "piatto di pesce", 3.50),
            new Meal("vegano", "piatto di pesce", 2.70)
    );

    @GetMapping("/meal/price")
    public ResponseEntity<?> mealName(@RequestParam("min") Double minPrice, @RequestParam("max") Double maxPrice) {


        List<Meal> priceMeal = new ArrayList<>();

        for (Meal meal : meals){
            if(meal.getPrice() <= maxPrice && meal.getPrice() >= minPrice){
                priceMeal.add(meal);
            }
        }
        return ResponseEntity.ok(priceMeal);

    }
}
