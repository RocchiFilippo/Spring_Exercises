package com.example.Spring_Develhope_Exercise.controller;

import com.example.Spring_Develhope_Exercise.Model.Meal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class MealModifyController {

    private List<Meal> meals = new ArrayList<>();

    @GetMapping("/get/meal")
    public ResponseEntity<List<Meal>> getMeal(){
        return ResponseEntity.ok(meals);
    }

    //Exercise 3.1
    @PutMapping ("/put/meal")
    public ResponseEntity<String> putMeal(@RequestBody Meal meal){
        this.meals.add(meal);
        return ResponseEntity.ok("Meals added!");
    }

    //Exercise 3.2
    @PostMapping("/post/replace-meal/{oldMealName}")
    public ResponseEntity<String> replaceMeal(@PathVariable ("oldMealName") String oldMealName, @RequestBody Meal meal){
        this.meals.removeIf( oldMeal -> oldMeal.getName().equals(oldMealName));
        this.meals.add(meal);
        return ResponseEntity.ok("Meal Updated!");
    }

    //Exercise 3.3
    @DeleteMapping("/delete/meal/{mealName}")
    public ResponseEntity<String> deleteMeal(@PathVariable String mealName){
        this.meals.removeIf(meal -> meal.getName().equals(mealName));
        return ResponseEntity.ok("Meal deleted!");
    }

    //Exercise 3.4
    @DeleteMapping("/delete/meal/price/{price}")
    public ResponseEntity<String> deleteByPrice(@PathVariable Double price){
        this.meals = this.meals.stream()
                .filter(meal -> meal.getPrice() <= price)
                .collect(Collectors.toList());

        return ResponseEntity.ok("More expensive meals removed!");
    }

    //Exercise 3.5
    @PutMapping("/put/meal/{name}/price")
    public ResponseEntity<?> updatedPrice(@PathVariable String name){
        for (Meal meal: meals){
            if (meal.getName().equals(name)){
                return ResponseEntity.ok(meal.getPrice());
            }
        }
        return ResponseEntity.badRequest().body("invalid name");
    }
}
