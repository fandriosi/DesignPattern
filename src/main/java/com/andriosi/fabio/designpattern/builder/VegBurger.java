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
public class VegBurger extends Burger{

    @Override
    public float price() {
        return 25.5f;
    }

    @Override
    public String name() {
        return Burgers.VEG_BURGER.name();
    }
    
}
