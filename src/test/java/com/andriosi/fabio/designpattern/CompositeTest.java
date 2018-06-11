/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern;

import com.andriosi.fabio.designpattern.composite.Departament;
import com.andriosi.fabio.designpattern.composite.Employee;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class CompositeTest {
    private List<Employee> sb;
    private Employee ceo, hs, hm, m1, m2, m3, s1, s2;
    public CompositeTest() {
        this.ceo = new Employee("John", Departament.CEO, 30000.50f);
        this.hs = new Employee("Robert", Departament.HEAD_SALE, 20000.00f);
        this.hm = new Employee("Michel", Departament.HEAD_MARKETING, 20000.00f);
        this.m1 = new Employee("Laura", Departament.MARKETING, 10000.00f);
        this.m2 = new Employee("Bob", Departament.MARKETING, 10000.00f);
        this.s1 = new Employee("Richard", Departament.SALE, 10000.00f);
        this.s2 = new Employee("Rob", Departament.SALE, 10000.00f);
        ceo.add(hs);
        ceo.add(hm);
        hs.add(s1);
        hs.add(s2);
        hm.add(m1);
        hm.add(m2);
    }
    @Test
    public void ceo(){
        assertEquals("Employee [ Name: John, Departament: CEO, Salary: 30000.5 ]", ceo.toString());
    }
    @Test
    public void ceoEmployee(){
        assertEquals("Employee [ Name: Robert, Departament: HEAD_SALE, Salary: 20000.0 ]", ceo.getSobordinates().get(0).toString());
        assertEquals("Employee [ Name: Michel, Departament: HEAD_MARKETING, Salary: 20000.0 ]", ceo.getSobordinates().get(1).toString());
    }
    @Test
    public void maketingEmployee(){
        assertEquals("Employee [ Name: Michel, Departament: HEAD_MARKETING, Salary: 20000.0 ]", hm.toString());
        assertEquals("Employee [ Name: Laura, Departament: MARKETING, Salary: 10000.0 ]", hm.getSobordinates().get(0).toString());
        assertEquals("Employee [ Name: Bob, Departament: MARKETING, Salary: 10000.0 ]", hm.getSobordinates().get(1).toString());
    }
    @Test
    public void saleEmployee(){
        assertEquals("Employee [ Name: Robert, Departament: HEAD_SALE, Salary: 20000.0 ]", hs.toString());
        assertEquals("Employee [ Name: Richard, Departament: SALE, Salary: 10000.0 ]", hs.getSobordinates().get(0).toString());
        assertEquals("Employee [ Name: Rob, Departament: SALE, Salary: 10000.0 ]", hs.getSobordinates().get(1).toString());
    }
}
