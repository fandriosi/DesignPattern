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
public class Pepsi extends ColdDrink{

    @Override
    public float price() {
        return 12.6f;
    }

    @Override
    public String name() {
        return Drinks.PEPSI.name();
    }
    
}
