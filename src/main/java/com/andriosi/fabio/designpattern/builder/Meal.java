/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rcpd2158
 */
public class Meal {
    private final Map<String,Item> items = new HashMap<>();
    public void addItem(Item item){
        items.put(item.name(),item);
    }
    public float getPreco(){
        float cost = 0.0f;
        cost = items.values().stream().map((i) -> 
                i.price()).reduce(cost, (Float accumulator, Float _item)
                        -> accumulator + _item);
        return cost;
    }
    public Item getItem(String name){
        return items.get(name);
    }
}
