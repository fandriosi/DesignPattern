/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.factory;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class ColorFactory extends AbstractFactory{

    @Override
    public Color getColor(Colors colors) {
        if(colors == null){
            return null;
        }
        if(colors == Colors.BLUE){
            return new Blue();
        }
        if(colors == Colors.GREEN){
            return new Green();
        }
        if(colors == Colors.RED){
            return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(Shapes shapes) {
        return null;
    }
    
}
