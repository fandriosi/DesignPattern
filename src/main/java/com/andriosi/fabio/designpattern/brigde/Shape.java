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
public abstract class Shape {
    protected DrawApi da;

    public Shape(DrawApi da) {
        this.da = da;
    }
    
    public abstract String draw();
}
