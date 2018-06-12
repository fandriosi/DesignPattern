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
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level) {
        this.level = level;
    }    
    @Override
    protected String write(String message) {
        return "Standard Console::Logger: ".concat(message).concat("\n");
    }
    
}
