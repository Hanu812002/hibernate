package com.example.hibernate.map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class map_main {
    	@SuppressWarnings("deprecation")
        public static void main(String[] args)  {
		// SpringApplication.run(HibernateApplication.class, args);
		System.out.println("Started............");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
         
        questin q1=new questin();

        q1.setQues_id(1);
        q1.setQues("What is java ?");

        Answer a1=new Answer();
        a1.setAns("Programming language");
        a1.setAns_id(101);

        q1.setAns(a1);


        questin q2=new questin();

        q2.setQues_id(2);
        q2.setQues("What is spring boot ?");

        Answer a2=new Answer();
        a2.setAns("Framework");
        a2.setAns_id(102);

        q2.setAns(a2);


        Session s=factory.openSession();
        Transaction t1=s.beginTransaction();

        s.save(q2);
        s.save(a2);
        t1.commit();
        s.close();
         factory.close();
    
}
}