/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern;

import com.andriosi.fabio.designpattern.factory.AbstractFactory;
import com.andriosi.fabio.designpattern.factory.Choice;
import com.andriosi.fabio.designpattern.factory.Color;
import com.andriosi.fabio.designpattern.factory.Colors;
import com.andriosi.fabio.designpattern.factory.FactoryProducer;
import com.andriosi.fabio.designpattern.factory.Shape;
import com.andriosi.fabio.designpattern.factory.Shapes;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class FactoryTeste {
    private final AbstractFactory sf;
    private final AbstractFactory cf;
    private Shape s;
    private Color c;
    public FactoryTeste() {
        this.sf = FactoryProducer.getFactory(Choice.SHAPES);
        this.cf = FactoryProducer.getFactory(Choice.COLORS);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void Rectangle() {
        s = sf.getShape(Shapes.RECTANGLE);
        assertEquals("Inside Rectangle::draw() method.", s.draw());
     }
     @Test
     public void Cicle() {
        s = sf.getShape(Shapes.CICLE);
        assertEquals("Inside Cicle::draw() method.", s.draw());
     }
     @Test
     public void Square() {
        s = sf.getShape(Shapes.SQUARE);
        assertEquals("Inside Square::draw() method.", s.draw());
     }
     @Test
     public void Red(){
         c = cf.getColor(Colors.RED);
        assertEquals("Inside Red:: fill() method", c.fill());
     }
     @Test
     public void Blue(){
         c = cf.getColor(Colors.BLUE);
        assertEquals("Inside Blue:: fill() method", c.fill());
     }
     @Test
     public void Green(){
         c = cf.getColor(Colors.GREEN);
        assertEquals("Inside Green:: fill() method", c.fill());
     }
}
