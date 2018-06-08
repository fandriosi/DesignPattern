/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.prototype;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public abstract class Shape implements Cloneable{
    
    private String id;
    protected Shapes type;
    abstract String draw();
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   
    public Shapes getType() {
        return type;
    }    
    @Override
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
