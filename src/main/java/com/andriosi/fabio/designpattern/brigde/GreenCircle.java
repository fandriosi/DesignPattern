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
public class GreenCircle implements DrawApi{

    @Override
    public String DrawCircle(int radius, int x, int y) {
        return "Drawing Circle[color: green, radius: "+radius+" x: "+x+" y: "+y+"]";
    }
    
}
