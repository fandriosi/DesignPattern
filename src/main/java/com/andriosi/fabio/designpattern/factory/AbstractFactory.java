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
public abstract class AbstractFactory {
    public abstract Color getColor(Colors colors);
    public abstract Shape getShape(Shapes shapes);
}
