/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.teste;

import com.andriosi.fabio.designpattern.singleton.SingleObject;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class TestSingleton {
    
    public TestSingleton() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void message() {
         assertEquals("Hello World!", SingleObject.getInstance().showMessage());
     }
}
