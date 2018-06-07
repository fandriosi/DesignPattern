/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.builder;

/**
 *
 * @author rcpd2158
 */
public class MealBuilder {
    public Meal prepareVegMeal(Drinks drink){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        if(drink == Drinks.COKE)
            meal.addItem(new Coke());
        if(drink == Drinks.PEPSI)
            meal.addItem(new Pepsi());
        return meal;
    }
    
    public Meal prepareChickenMeal(Drinks drink){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        if(drink == Drinks.COKE)
            meal.addItem(new Coke());
        if(drink == Drinks.PEPSI)
            meal.addItem(new Pepsi());
        return meal;
    }
}
