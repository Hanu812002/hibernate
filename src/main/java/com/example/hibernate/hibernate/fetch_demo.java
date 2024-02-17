package com.example.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetch_demo {
 
    public static void main(String[] args) {
		System.out.println("Started............");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = factory.openSession();

        //get   id nhi hogi toh null dega
        //load id nhi hogi to exception aaiga
         student st1=(student)s.get(student.class, 1002);
         System.out.println(st1);

        factory.close();
		s.close();

    }
}
