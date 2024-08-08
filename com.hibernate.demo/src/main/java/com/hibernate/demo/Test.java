package com.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("project started....");
		
        Configuration cfg = new Configuration ();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
//       System.out.println(factory);
        
        Student st =new Student ();
                st.setId(3);
        st.setName("raj");
        st.setCity("pune");
        
         System.out.println(st);

       
       Transaction tx =session.beginTransaction();
       session.save(st);
       tx.commit();
       session.close();
       
        
	}

}
