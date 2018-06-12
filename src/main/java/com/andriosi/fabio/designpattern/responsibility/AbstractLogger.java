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
public abstract class AbstractLogger {
    protected int level;
    private String message;
    // next element in chain responsibility
    protected AbstractLogger nextLogger;
    
    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }
    
    public String logMessage(int level, String message){   
        String m ="";
        if(this.level <= level){
            m = write(message);
        }
        if(nextLogger != null){
            m+=nextLogger.logMessage(level, message);
        }
        return m;
    }
    protected abstract String write(String message);
}
