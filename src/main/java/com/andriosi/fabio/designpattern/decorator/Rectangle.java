/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.decorator;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class Rectangle implements Shape{
    @Override
    public String draw() {
        return "Shape: "+Shapes.RECTANGLE.name();
    }
}
