/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();
    
    public static Shape getShape(String shapId){
        Shape cachedShape = shapeMap.get(shapId);
        return (Shape) cachedShape.clone();
    }
    public static void loadCache(){
        Circle c = new Circle();
        c.setId("1");
        shapeMap.put(c.getId(), c);
        Square s = new Square();
        s.setId("2");
        shapeMap.put(s.getId(), s);
        Rectangle r = new Rectangle();
        r.setId("3");
        shapeMap.put(r.getId(), r);
    }    
}
