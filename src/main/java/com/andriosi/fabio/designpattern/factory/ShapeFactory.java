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
public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(Shapes shapes){
        if(shapes == null){
            return null;
        }
        if(shapes == Shapes.CICLE){
            return new Cicle();
        }
        if(shapes == Shapes.RECTANGLE){
            return new Rectangle();
        }
        if(shapes == Shapes.SQUARE){
            return new Square();
        }
            
        return null;
    }

    @Override
    public Color getColor(Colors colors) {
        return null;
    }
}
