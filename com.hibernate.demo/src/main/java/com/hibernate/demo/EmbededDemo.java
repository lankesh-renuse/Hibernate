package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbededDemo {
	
	public static void main (String [] args ) {
		
		Configuration cfg = new Configuration ();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student student1 =new Student();
		student1.setId(2);
		student1.setName("dhiraj");
		student1.setCity("pune");
		
		certificate certificate1 = new certificate();
		certificate1.setCourse("java");
		certificate1.setDuretion(" 6 months");
		
		
		Student student2 =new Student();
		student2.setId(3);
		student2.setName("akash");
		student2.setCity("pune");
		
		certificate certificate2 = new certificate();
		certificate2.setCourse("java");
		certificate2.setDuretion(" 6 months");
		
		student1.setCerti(certificate1);
		student2.setCerti(certificate2);
		
		
		Transaction tx = session.beginTransaction();
		 session.save(student1);
		 session.save(student2);
		 
		 tx.commit();
		session.close();
		factory.close();
		
		
	}

}
