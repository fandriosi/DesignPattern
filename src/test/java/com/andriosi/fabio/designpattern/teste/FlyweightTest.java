/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.teste;


import com.andriosi.fabio.designpattern.flyweight.Circle;
import com.andriosi.fabio.designpattern.flyweight.Colors;
import com.andriosi.fabio.designpattern.flyweight.ShapeFactory;
import java.util.HashMap;
import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class FlyweightTest {
    HashMap<String,Circle> cm = new HashMap<>();
    Random r = new Random();
    public FlyweightTest() {
        String [] color = {Colors.BLACK.name(), Colors.BLUE.name(), Colors.GREEN.name(), Colors.RED.name(),Colors.WHITE.name()};
        for(int i = 0; i< color.length; i++){
            Circle c = (Circle) ShapeFactory.getCircle(color[i]);
            c.setRadius((r.nextInt(100)));
            c.setX(r.nextInt(100));
            c.setY(r.nextInt(100));
            cm.put(color[i], c);
        }
    }
    @Test
    public void flyweightRed(){
        Circle c = (Circle) cm.get(Colors.RED.name());
        assertEquals("Cicle: Draw() [Color: RED, x: "+c.getX()+", y: "+c.getY()+", radius: "+c.getRadius()+"]", c.draw());
    }
    @Test
    public void flyweightGreen(){
        Circle c = (Circle) cm.get(Colors.GREEN.name());
        assertEquals("Cicle: Draw() [Color: GREEN, x: "+c.getX()+", y: "+c.getY()+", radius: "+c.getRadius()+"]", c.draw());
    }
    @Test
    public void flyweightBlue(){
        Circle c = (Circle) cm.get(Colors.BLUE.name());
       assertEquals("Cicle: Draw() [Color: BLUE, x: "+c.getX()+", y: "+c.getY()+", radius: "+c.getRadius()+"]", c.draw());
    }
    @Test
    public void flyweightWhite(){
        Circle c = (Circle) cm.get(Colors.WHITE.name());
       assertEquals("Cicle: Draw() [Color: WHITE, x: "+c.getX()+", y: "+c.getY()+", radius: "+c.getRadius()+"]", c.draw());
    }
    @Test
    public void flyweightBrack(){
        Circle c = (Circle) cm.get(Colors.BLACK.name());
       assertEquals("Cicle: Draw() [Color: BLACK, x: "+c.getX()+", y: "+c.getY()+", radius: "+c.getRadius()+"]", c.draw());
    }
    
}
