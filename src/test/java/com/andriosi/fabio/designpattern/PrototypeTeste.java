/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern;

import com.andriosi.fabio.designpattern.prototype.Shape;
import com.andriosi.fabio.designpattern.prototype.ShapeCache;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class PrototypeTeste {
    public PrototypeTeste() {
        ShapeCache.loadCache();
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void cicle() {
         Shape c = (Shape) ShapeCache.getShape("1");
         assertEquals("CIRCLE", c.getType().name());
                 
     }
     @Test
     public void square() {
         Shape c = (Shape) ShapeCache.getShape("2");
         assertEquals("SQUARE", c.getType().name());
                 
     }
     
     @Test
     public void rectangle() {
         Shape c = (Shape) ShapeCache.getShape("3");
         assertEquals("RECTANGLE", c.getType().name());
                 
     }
}

