/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.teste;

import com.andriosi.fabio.designpattern.builder.Burger;
import com.andriosi.fabio.designpattern.builder.Burgers;
import com.andriosi.fabio.designpattern.builder.ChickenBurger;
import com.andriosi.fabio.designpattern.builder.Coke;
import com.andriosi.fabio.designpattern.builder.ColdDrink;
import com.andriosi.fabio.designpattern.builder.Drinks;
import com.andriosi.fabio.designpattern.builder.Meal;
import com.andriosi.fabio.designpattern.builder.MealBuilder;
import com.andriosi.fabio.designpattern.builder.Pepsi;
import com.andriosi.fabio.designpattern.builder.VegBurger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rcpd2158
 */
public class BuilderTeste {
    private Burger b;
    private ColdDrink d;
    private MealBuilder mb;
    private Meal m;
    public BuilderTeste() {
        this.mb = new MealBuilder();
    }
    @Test
    public void vegBurger(){
        b = new VegBurger();
        assertEquals("VEG_BURGER", b.name());
        assertEquals("25.5", String.valueOf(b.price()));
    }
    @Test
    public void chickenBurger(){
        b = new ChickenBurger();
        assertEquals("CHICKEN_BURGER", b.name());
        assertEquals("55.0", String.valueOf(b.price()));
    }
    @Test
    public void pepsi(){
        d = new Pepsi();
        assertEquals("PEPSI", d.name());
        assertEquals("12.6", String.valueOf(d.price()));
    }
    
    @Test
    public void coke(){
        d = new Coke();
        assertEquals("COKE", d.name());
        assertEquals("16.0", String.valueOf(d.price()));
    }
    @Test
    public void mealVegCoke(){
        m = mb.prepareVegMeal(Drinks.COKE);
        assertEquals("41.5",String.valueOf(m.getPreco()) );
        assertEquals("COKE", m.getItem(Drinks.COKE.name()).name());
        assertEquals("VEG_BURGER", m.getItem(Burgers.VEG_BURGER.name()).name());
    }
    @Test
    public void mealVegPespsi(){
        m = mb.prepareVegMeal(Drinks.PEPSI);
        assertEquals("38.1",String.valueOf(m.getPreco()) );
        assertEquals("PEPSI", m.getItem(Drinks.PEPSI.name()).name());
        assertEquals("VEG_BURGER", m.getItem(Burgers.VEG_BURGER.name()).name());
    }
    @Test
    public void mealChickenCoke(){
        m = mb.prepareChickenMeal(Drinks.COKE);
        assertEquals("71.0",String.valueOf(m.getPreco()) );
        assertEquals("COKE", m.getItem(Drinks.COKE.name()).name());
        assertEquals("CHICKEN_BURGER", m.getItem(Burgers.CHICKEN_BURGER.name()).name());
    }
    @Test
    public void mealChickenPespsi(){
        m = mb.prepareChickenMeal(Drinks.PEPSI);
        assertEquals("67.6",String.valueOf(m.getPreco()) );
        assertEquals("PEPSI", m.getItem(Drinks.PEPSI.name()).name());
        assertEquals("CHICKEN_BURGER", m.getItem(Burgers.CHICKEN_BURGER.name()).name());
    }
}
