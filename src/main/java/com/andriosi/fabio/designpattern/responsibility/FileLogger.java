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
public class FileLogger extends AbstractLogger{
    public FileLogger(int level) {
        this.level = level;
    }    
    @Override
    protected String write(String message) {
        return "File::Logger: ".concat(message).concat("\n");
    }  
}
