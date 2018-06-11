/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.teste;

import com.andriosi.fabio.designpattern.decorator.Circle;
import com.andriosi.fabio.designpattern.decorator.Rectangle;
import com.andriosi.fabio.designpattern.decorator.RedShapeDecorator;
import com.andriosi.fabio.designpattern.decorator.Shape;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class DecoratorTest {
    
    public DecoratorTest() {
    }
    @Test
    public void docoratorCircle(){
        Shape c = new Circle();
        assertEquals("Shape: CIRCLE",c.draw());
    }
    @Test
    public void docoratorRectangle(){
        Shape c = new Rectangle();
        assertEquals("Shape: RECTANGLE",c.draw());
    }
    
    @Test
    public void docoratorRedRectangle(){
        Shape r = new Rectangle();
        Shape rc = new RedShapeDecorator(r);
        assertEquals("Shape: RECTANGLE\nBorder Color: Red",rc.draw());
    }
     @Test
    public void docoratorRedCircle(){
        Shape c = new Circle();
        Shape rc = new RedShapeDecorator(c);
        assertEquals("Shape: CIRCLE\nBorder Color: Red",rc.draw());
    }
}
