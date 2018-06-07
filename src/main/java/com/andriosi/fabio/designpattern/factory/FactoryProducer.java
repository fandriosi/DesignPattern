/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.factory;

/**
 *
 * @author rcpd2158
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(Choice choice){
        if(choice == Choice.SHAPES){
            return new ShapeFactory();
        }
        if(choice == Choice.COLORS){
            return new ColorFactory();
        }
        return null;
    }
}
