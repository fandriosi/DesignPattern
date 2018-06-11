/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.flyweight;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class Circle implements Shape{
    private String color;
    private int x, y, radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }
        
    @Override
    public String draw() {
        return"Cicle: Draw() [Color: "+color+", x: "+x+", y: "+y+", radius: "+radius+"]";
    }
    
}
