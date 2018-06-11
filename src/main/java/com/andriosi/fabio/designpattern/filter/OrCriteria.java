/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.filter;

import java.util.List;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class OrCriteria implements Criteria{
    private Criteria c;
    private Criteria oc;

    public OrCriteria(Criteria c, Criteria oc) {
        this.c = c;
        this.oc = oc;
    }
    
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> fci = c.meetCriteria(persons);
        List<Person> oci = oc.meetCriteria(persons);
        oci.forEach((c) -> {
            if(!fci.contains(persons)){
                fci.add(c);
            }
        });
        return fci;
    }
    
}
