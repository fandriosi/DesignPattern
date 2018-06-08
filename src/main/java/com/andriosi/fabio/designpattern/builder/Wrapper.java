
package com.andriosi.fabio.designpattern.builder;

/**
 *
 * @author "Fábio Luis Andriosi"
 */

public class Wrapper implements Packing{
    @Override
    public Packings pack() {
        return Packings.WRAPPER;
    }
    
}
