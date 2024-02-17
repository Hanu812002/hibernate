package com.example.hibernate.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class HibernateApplication {

	public static void main(String[] args) throws IOException {
		// SpringApplication.run(HibernateApplication.class, args);
		System.out.println("Started............");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		System.out.println(factory.isClosed());

		student st = new student();
		st.setId(1002);
		st.setCity("Muradnagar");
		st.setName("Kiet");

		
        address ad=new address();
		ad.setCity("Meerut");
		ad.setId(1001);
		ad.setStreet("61 Anaj Mandi");
		ad.setAddedDate(new Date());
		ad.setX(105.12);

		//image

		// FileInputStream fs=new FileInputStream("src/main/java/img.jpg");
        // byte[] data=new byte[fs.available()];
		// fs.read(data);
		// ad.setImage(data);

		Session s = factory.openSession();
		s.beginTransaction();
		s.save(st);
		s.save(ad);
		
		s.getTransaction().commit();
		s.close();

	}

}
