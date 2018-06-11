/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.flyweight;

import java.util.HashMap;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class ShapeFactory {
    private static final HashMap cm = new HashMap();
    
    public static Shape getCircle(String color){
        Circle c = (Circle) cm.get(color);
        if(c == null){
            c = new Circle(color);
            cm.put(color, c);
            System.out.println("Create circle color: "+ color);
            
        }
        return c;
    }
}
