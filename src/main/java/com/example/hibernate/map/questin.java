package com.example.hibernate.map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class questin {
        
     
        @Id
        private int ques_id;
        private String ques;
        
        @OneToOne
        private Answer ans;
         
        public questin(){
            super();
        }
        public questin(int ques_id, String ques, Answer ans) {
            this.ques_id = ques_id;
            this.ques = ques;
            this.ans = ans;
        }

        public int getQues_id() {
            return ques_id;
        }
        public void setQues_id(int ques_id) {
            this.ques_id = ques_id;
        }
        public String getQues() {
            return ques;
        }
        public void setQues(String ques) {
            this.ques = ques;
        }
        public Answer getAns() {
            return ans;
        }
        public void setAns(Answer ans) {
            this.ans = ans;
        }
    
    
}
