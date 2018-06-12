/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.responsibility;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public enum Logger {
    INFO(1),DEBUG(2), ERRO(3);
    private final int value;
    Logger(int value){
        this.value = value;
    };
    public int getValue(){
        return value;
    }
}
