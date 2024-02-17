package com.example.hibernate.manytomany;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main {
    public static void main(String[] args) throws IOException {
		// SpringApplication.run(HibernateApplication.class, args);
		System.out.println("Started............");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        emp e1=new emp();
        emp e2=new emp();

        e1.setEid(101);
        e1.setName("Hanu Agarwal");

        e2.setEid(102);
        e2.setName("Hanu_30");

        project p1=new project();
        project p2=new project();

        p1.setPid(10001);
        p1.setProjectname("Smart Care");

        p2.setPid(10002);
        p2.setProjectname("Fuck Off");

        List<project>pl=new ArrayList<project>();

        List<emp>el=new ArrayList<emp>();

        el.add(e1);
        el.add(e2);

        pl.add(p1);
        pl.add(p2);

        e1.setProjects(pl);

        p2.setEmpls(el);
		Session s = factory.openSession();
		s.beginTransaction();

        s.save(e1);
        s.save(e2);

        s.save(p1);
        s.save(p2);
        
		s.getTransaction().commit();
        factory.close();
    }
    
}
