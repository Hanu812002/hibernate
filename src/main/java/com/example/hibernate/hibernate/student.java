package com.example.hibernate.hibernate;

import org.hibernate.annotations.DialectOverride.OverridesAnnotation;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// table
@Entity
public class student {

    // primary key
    @Id
    private int id;
    private String name;
    private String city;

    //emeddable
    private certificate certi;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString() {
        return this.id+" : "+this.name + "  :  "+ this.city;
    }

    public student(){
        super();
    }
    public student(int id, String name, String city, certificate certi) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.certi = certi;
    }
    public certificate getCerti() {
        return certi;
    }
    public void setCerti(certificate certi) {
        this.certi = certi;
    }

    
}
