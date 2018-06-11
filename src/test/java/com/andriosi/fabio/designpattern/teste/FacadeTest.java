/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.teste;

import com.andriosi.fabio.designpattern.facade.ShapeMake;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class FacadeTest {
    private ShapeMake sm;
    public FacadeTest() {
        this.sm  = new ShapeMake();
    }
    
    @Test
    public void facadeCircle(){
        assertEquals("Circle::draw()", sm.drawCircle());
    }
    @Test
    public void facadeRectangle(){
        assertEquals("Rectangle::draw()", sm.drawRectangle());
    }
    @Test
    public void facadeSquare(){
        assertEquals("Square::draw()", sm.drawSquare());
    }
}
