/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.facade;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class ShapeMake {
    private Shape c;
    private Shape r;
    private Shape s;

    public ShapeMake() {
        this.c = new Circle();
        this.r = new Rectangle();
        this.s = new Square();
    }
    
    public String drawCircle(){
        return c.draw();
    }
    
    public String drawRectangle(){
        return r.draw();
    }
    
    public String drawSquare(){
        return s.draw();
    }
}
