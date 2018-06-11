/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.teste;

import com.andriosi.fabio.designpattern.brigde.Circle;
import com.andriosi.fabio.designpattern.brigde.GreenCircle;
import com.andriosi.fabio.designpattern.brigde.RedCircle;
import com.andriosi.fabio.designpattern.brigde.Shape;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class BridgeTest {
    
    public BridgeTest() {
        
    }
    @Test
    public void redCircle(){
        Shape s = new Circle(100, 100, 10, new RedCircle());
        assertEquals("Drawing Circle[color: red, radius: "+100+" x: "+100+" y: "+10+"]", s.draw());
    }
    @Test
    public void greeCircle(){
        Shape s = new Circle(100, 100, 10, new GreenCircle());
        assertEquals("Drawing Circle[color: green, radius: "+100+" x: "+100+" y: "+10+"]", s.draw());
    }
}
