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
public class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;  
        loadFromDisk(fileName);
    }
    @Override
    public String display() {
        return "Displaying: "+ fileName;
    }
    
    private void loadFromDisk(String FileName){
        System.out.println("Loading: "+fileName);
    }
}
