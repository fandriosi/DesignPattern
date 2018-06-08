/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.prototype;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class Square extends Shape{

    public Square() {
        type = Shapes.SQUARE;
    }
    
    @Override
    String draw() {
        return "Inside Square::draw() method.";
    }
    
}
