package com.example.hibernate.map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {

    @Id 
    private int ans_id;
    private String ans;
    public Answer(){
        super();
    }
    public int getAns_id() {
        return ans_id;
    }
    public void setAns_id(int ans_id) {
        this.ans_id = ans_id;
    }
    public String getAns() {
        return ans;
    }
    public void setAns(String ans) {
        this.ans = ans;
    }
   
}
