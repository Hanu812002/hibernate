package com.example.hibernate.hibernate;

import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Student_address")
public class address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50)
    private String street;
    private String city;
    private boolean isopen;

    //column create nhi hoga
    @Transient
    private double x;
    private Date addedDate;

    //large object
    @Lob
    private byte[] image;

    public address(int id, String street, String city, boolean isopen, double x, Date addedDate, byte[] image) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.isopen = isopen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }
    
    public address(){
        super();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isIsopen() {
        return isopen;
    }

    public void setIsopen(boolean isopen) {
        this.isopen = isopen;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
