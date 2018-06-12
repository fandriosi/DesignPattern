/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.teste;

import com.andriosi.fabio.designpattern.responsibility.AbstractLogger;
import com.andriosi.fabio.designpattern.responsibility.ConsoleLogger;
import com.andriosi.fabio.designpattern.responsibility.ErrorLogger;
import com.andriosi.fabio.designpattern.responsibility.FileLogger;
import com.andriosi.fabio.designpattern.responsibility.Logger;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class ResponsibilityTest {
    AbstractLogger el, cl, fl;
    public ResponsibilityTest() {
        this.el = new ErrorLogger(Logger.ERRO.getValue());
        this.fl = new FileLogger(Logger.DEBUG.getValue());
        this.cl = new ConsoleLogger(Logger.INFO.getValue());
        this.el.setNextLogger(this.fl);
        this.fl.setNextLogger(this.cl);
    }
    
    @Test
    public void console(){       
        assertEquals("Standard Console::Logger: This is an Information.\n", 
                fl.logMessage(Logger.INFO.getValue(), "This is an Information."));
    }
    @Test
    public void file(){
        assertEquals("Standard Console::Logger: This is an debug level information.\n",
                fl.logMessage(Logger.DEBUG.getValue(), "This is an debug level information."));
    }
    @Test
    public void error(){
        assertEquals("Standard Console::Logger: This is an error information.\n",
                fl.logMessage(Logger.ERRO.getValue(), "This is an error information.") );
    }
}
