/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class Employee {
    private String name;
    private Departament departament;
    private float salary;
    private List<Employee> sobordinates;

    public Employee(String name, Departament departament, float salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
        sobordinates= new ArrayList<>();
    }
    
    public void add(Employee employee){
        sobordinates.add(employee);
    }
    
    public void remove(Employee employee){
        sobordinates.remove(employee);
    }
    
    public List<Employee> getSobordinates(){
        return sobordinates;
    }

    @Override
    public String toString() {
        return "Employee ["+" Name: " + name + ", Departament: " + departament.name() + ", Salary: " + salary + " ]";
    }
    
    
}
