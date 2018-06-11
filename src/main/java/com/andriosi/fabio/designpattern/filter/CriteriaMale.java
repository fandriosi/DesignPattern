/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class CriteriaMale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> mp = new ArrayList<>();
        persons.forEach((p) ->{
            if(p.getGender() == Gender.MALE){
                mp.add(p);
            }
        });
        return mp;
    }
    
}
