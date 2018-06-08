/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.builder;
/**
 *
 * @author "Fábio Luis Andriosi"
 */

public class Coke extends ColdDrink{

    @Override
    public float price() {
        return 16.0f;
    }

    @Override
    public String name() {
        return Drinks.COKE.name();
    }
    
}
