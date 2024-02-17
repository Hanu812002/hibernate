package com.example.hibernate.hibernate;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class embeddable_stu {
    
    	public static void main(String[] args) throws IOException {
		// SpringApplication.run(HibernateApplication.class, args);
		System.out.println("Started............");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		System.out.println(factory.isClosed());

		student st = new student();
		st.setId(10001);
		st.setCity("Meerut");
		st.setName("Hanu_30");

        certificate c=new certificate();
        c.setCourse("Cpp");
        c.setDuration("12 weeks");
        st.setCerti(c);
        
		Session s = factory.openSession();
		s.beginTransaction();
		s.save(st);
		
		s.getTransaction().commit();
		s.close();

}
}