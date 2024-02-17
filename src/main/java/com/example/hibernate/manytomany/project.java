package com.example.hibernate.manytomany;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class project {
    
    @Id
    private int pid;
    private String projectname;

    //emp ki hi bnegi bs
    @jakarta.persistence.ManyToMany(mappedBy = "projects")
    private List<emp>empls;

    public project(){
        super();
    }
    public project(int pid, String projectname, List<emp> empls) {
        this.pid = pid;
        this.projectname = projectname;
        this.empls = empls;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public List<emp> getEmpls() {
        return empls;
    }

    public void setEmpls(List<emp> empls) {
        this.empls = empls;
    }

    
}
