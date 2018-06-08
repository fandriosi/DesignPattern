/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.prototype;

/**
 *
 * @author "Fabio Luis Andriosi"
 */
public class Circle extends Shape{

    public Circle() {
        type = Shapes.CIRCLE;
    }

    @Override
    String draw() {
        return "Inside Cicle::draw() method.";
    }
    
    
}
