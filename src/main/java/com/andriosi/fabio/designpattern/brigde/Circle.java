/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.brigde;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class Circle extends Shape{
    private int radius, x, y;

    public Circle(int radius, int x, int y, DrawApi da) {
        super(da);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public String draw() {
        return da.DrawCircle(radius, x, y);
    }
    
}
