/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.proxy;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class ProxyImage implements Image{
    private RealImage ri;
    private String fn;
    
    public ProxyImage(String fn) {
        this.fn = fn;
    }
    @Override
    public String display() {

        if(ri == null){
            ri = new RealImage(fn);
        }
        return ri.display();
    }
    
    
}
