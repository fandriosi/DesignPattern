/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern;

import com.andriosi.fabio.designpattern.proxy.Image;
import com.andriosi.fabio.designpattern.proxy.ProxyImage;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class ProxyTest {
    private Image i;
    public ProxyTest() {
        
    }
    @Test
    public void proxyImage(){
        i = new ProxyImage("test_100.jpg");
        assertEquals("Displaying: test_100.jpg", i.display());
    }
    
}
