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
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
