/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.designpattern.teste;

import com.andriosi.fabio.designpattern.filter.AndCriteria;
import com.andriosi.fabio.designpattern.filter.Criteria;
import com.andriosi.fabio.designpattern.filter.CriteriaFemale;
import com.andriosi.fabio.designpattern.filter.CriteriaMale;
import com.andriosi.fabio.designpattern.filter.CriteriaMarried;
import com.andriosi.fabio.designpattern.filter.CriteriaSingle;
import com.andriosi.fabio.designpattern.filter.Gender;
import com.andriosi.fabio.designpattern.filter.OrCriteria;
import com.andriosi.fabio.designpattern.filter.Person;
import com.andriosi.fabio.designpattern.filter.Status;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author "Fábio Luis Andriosi"
 */
public class FilterTest {
    private List<Person> persons;
    public FilterTest() {
        this.persons = new ArrayList<>();
        persons.add(new Person("Robert",Gender.MALE, Status.SINGLE));
        persons.add(new Person("John", Gender.MALE, Status.MARRIED));
        persons.add(new Person("Laura", Gender.FEMALE, Status.MARRIED));
        persons.add(new Person("Diana", Gender.FEMALE, Status.SINGLE));
        persons.add(new Person("Mike", Gender.MALE, Status.SINGLE));
        persons.add(new Person("Bobby", Gender.MALE, Status.SINGLE));
    }
    
    @Test
    public void criteriaMale(){
        Criteria m = new CriteriaMale();
        assertEquals("Name: Robert, Gender: MALE, Material Status: SINGLE", m.meetCriteria(persons).get(0).toString());
        assertEquals("Name: John, Gender: MALE, Material Status: MARRIED", m.meetCriteria(persons).get(1).toString());
        assertEquals("Name: Mike, Gender: MALE, Material Status: SINGLE", m.meetCriteria(persons).get(2).toString());
        assertEquals("Name: Bobby, Gender: MALE, Material Status: SINGLE", m.meetCriteria(persons).get(3).toString());
    }
    @Test
    public void criteriaFamele(){
        Criteria f = new CriteriaFemale();
        assertEquals("Name: Laura, Gender: FEMALE, Material Status: MARRIED", f.meetCriteria(persons).get(0).toString());
        assertEquals("Name: Diana, Gender: FEMALE, Material Status: SINGLE", f.meetCriteria(persons).get(1).toString());        
    }
    
    @Test
    public void criteriaSingle(){
        Criteria s = new CriteriaSingle();
        assertEquals("Name: Robert, Gender: MALE, Material Status: SINGLE", s.meetCriteria(persons).get(0).toString());
        assertEquals("Name: Diana, Gender: FEMALE, Material Status: SINGLE", s.meetCriteria(persons).get(1).toString());
        assertEquals("Name: Mike, Gender: MALE, Material Status: SINGLE", s.meetCriteria(persons).get(2).toString());
        assertEquals("Name: Bobby, Gender: MALE, Material Status: SINGLE", s.meetCriteria(persons).get(3).toString());
    }
    @Test
    public void criteriaMarried(){
        Criteria m = new CriteriaMarried();
        assertEquals("Name: John, Gender: MALE, Material Status: MARRIED", m.meetCriteria(persons).get(0).toString());
        assertEquals("Name: Laura, Gender: FEMALE, Material Status: MARRIED", m.meetCriteria(persons).get(1).toString());
    }
    @Test
    public void andCriteria(){
        Criteria m = new CriteriaMale();
        Criteria s = new CriteriaSingle();
        Criteria a = new AndCriteria(s, m);
        assertEquals("Name: Robert, Gender: MALE, Material Status: SINGLE", a.meetCriteria(persons).get(0).toString());
        assertEquals("Name: Mike, Gender: MALE, Material Status: SINGLE", a.meetCriteria(persons).get(1).toString());
        assertEquals("Name: Bobby, Gender: MALE, Material Status: SINGLE", a.meetCriteria(persons).get(2).toString());
    }
    @Test
    public void orCriteria(){
        Criteria f = new CriteriaFemale();
        Criteria s = new CriteriaSingle();
        Criteria a = new OrCriteria(s, f);
        assertEquals("Name: Robert, Gender: MALE, Material Status: SINGLE", a.meetCriteria(persons).get(0).toString());       
        assertEquals("Name: Diana, Gender: FEMALE, Material Status: SINGLE", a.meetCriteria(persons).get(1).toString());
        assertEquals("Name: Mike, Gender: MALE, Material Status: SINGLE", a.meetCriteria(persons).get(2).toString());
        assertEquals("Name: Bobby, Gender: MALE, Material Status: SINGLE", a.meetCriteria(persons).get(3).toString()); 
        assertEquals("Name: Laura, Gender: FEMALE, Material Status: MARRIED", a.meetCriteria(persons).get(4).toString());
    }
}
