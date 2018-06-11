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
public class AndCriteria implements Criteria{
    private Criteria c;
    private Criteria oc;

    public AndCriteria(Criteria c, Criteria oc) {
        this.c = c;
        this.oc = oc;
    }
    
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> fcp = c.meetCriteria(persons);
        return oc.meetCriteria(fcp);
    }
    
}
