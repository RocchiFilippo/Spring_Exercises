package com.example.Spring_Develhope_Exercise.controller;

import com.example.Spring_Develhope_Exercise.Model.Meal;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MealController {

    /*private List<Meal> chefsSpecials = Arrays.asList(
            new Meal("Carbonara","Spaghetti con guanciale, uovo, pepe e pecorino",9.50),
            new Meal("Spaghetti allo Scoglio","Spaghetti con frutti di mare",13.50),
            new Meal("Tortellini in Brodo","Tortellini nel brodo",8.70)
    );

    private List<Meal> soupOfDay = Arrays.asList(
            new Meal("zuppa di fagioli","una zuppa fatta con i fagioli",7.40),
            new Meal("zuppa di patate","zuppa fatta con le patate",6.50),
            new Meal("zuppa di tristezza","zuppa fatta con le lacrime",3.10)
    );

    @GetMapping("/get/day-dependet-special")
    public ResponseEntity<?> getChefsSpecial(
            @RequestParam("dayOfWeekIndex") int dayOfWeekIndex,
            @RequestParam("isSoupOfTheDay") boolean mealIndex) {
        if(dayOfWeekIndex < 0 || dayOfWeekIndex > 2){
            return ResponseEntity.badRequest().body("Invalid day of the week index. Must be between 0 and 2.");
        }

        if(mealIndex){
            return ResponseEntity.ok(soupOfDay.get(dayOfWeekIndex));
        } else {
            return ResponseEntity.ok(chefsSpecials.get(dayOfWeekIndex));
        }
    }*/

    /*private List<Meal> meals = new ArrayList<>();

    @GetMapping("/get/meal")
    public ResponseEntity<List<Meal>> getMeal(){
        return ResponseEntity.ok(meals);
    }
    @PutMapping ("/put/meal")
    public ResponseEntity<String> putMeal(@RequestBody Meal meal){
        this.meals.add(meal);
        return ResponseEntity.ok("Meals added!");
    }

    @DeleteMapping("/delete/meal/{mealName}")
    public ResponseEntity<String> deleteMeal(@PathVariable String mealName){
        this.meals.removeIf(meal -> meal.getName().equals(mealName));
        return ResponseEntity.ok("Meal deleted!");
    }

    @PostMapping("/post/replace-meal")
    public ResponseEntity<String> replaceMeal(@RequestBody Meal meal){
        this.meals.removeIf(oldMeal -> oldMeal.getName().equals(meal.getName()));
        this.meals.add(meal);
        return ResponseEntity.ok("Meal Updated!");
    }*/
}
