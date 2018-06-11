/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.filter;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class Person {
    private String name;
    private Gender gender;
    private Status materialStatus;

    public Person(String name, Gender gender, Status materialStatus) {
        this.name = name;
        this.gender = gender;
        this.materialStatus = materialStatus;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Status getMaterialStatus() {
        return materialStatus;
    }   

    @Override
    public String toString() {
        return "Name: " + name + ", Gender: " + gender.name() + ", Material Status: " + materialStatus.name();
    }
    
    
}
