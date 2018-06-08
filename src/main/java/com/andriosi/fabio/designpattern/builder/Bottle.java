/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.builder;
/**
 *
 * @author "Fábio Luis Andriosi"
 */

public class Bottle implements Packing{

    @Override
    public Packings pack() {
        return Packings.BOTTLE;
    }
    
}
