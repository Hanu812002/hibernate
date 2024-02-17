package com.example.hibernate.manytomany;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class emp {
    
    @Id
    private int eid;
    private String name;

    @ManyToMany
    private List<project> projects;
    public emp(){
        super();
    }
    public emp(int eid, String name, List<project> projects) {
        this.eid = eid;
        this.name = name;
        this.projects = projects;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<project> getProjects() {
        return projects;
    }

    public void setProjects(List<project> projects) {
        this.projects = projects;
    }

}
