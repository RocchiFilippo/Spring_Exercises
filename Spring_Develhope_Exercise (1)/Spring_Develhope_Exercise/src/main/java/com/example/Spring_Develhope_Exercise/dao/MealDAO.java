package com.example.Spring_Develhope_Exercise.dao;

import com.example.Spring_Develhope_Exercise.model.Meal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MealDAO {
    private List<Meal> meals = new ArrayList<>();

    public void addMeal(Meal meal){
        this.meals.add(meal);
    }

    public void deleteMeal(String mealName){
        this.meals.removeIf(meal -> meal.getName().equals(mealName));
    }

    public void updateMeal(Meal meal){
        this.meals.removeIf(meal1 -> meal1.getName().equals(meal.getName()));
        this.meals.add(meal);
    }

    public List<Meal> getMeals(){
        return this.meals;
    }
}
