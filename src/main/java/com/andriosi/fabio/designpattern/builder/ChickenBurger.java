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

public class ChickenBurger extends Burger{

    @Override
    public float price() {
        return 55.0f;
    }

    @Override
    public String name() {
        return Burgers.CHICKEN_BURGER.name();
    }
    
}
