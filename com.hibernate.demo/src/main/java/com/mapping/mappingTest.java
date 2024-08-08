package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mappingTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Question q1 = new Question();
		q1.setQuestionId(11);
		q1.setQusetion("what is java ?");

		Answer ans1 = new Answer();
		ans1.setAnswerId(22);
		ans1.setAnswer("java is programming languge.");
		q1.setAnswer(ans1);

		Question q2 = new Question();
		q2.setQuestionId(12);
		q2.setQusetion("what is collection framework ?");

		Answer ans2 = new Answer();
		ans2.setAnswerId(23);
		ans2.setAnswer("API to work with objects in java.");
		q2.setAnswer(ans2);

		Transaction tx = session.beginTransaction();

		session.save(ans1);
		session.save(ans2);
		
		session.save(q1);
		session.save(q2);
		
		
		 Question newQ = (Question)session.get(Question.class, 12 );
		 System.out.println(newQ.getQusetion());
		 System.out.println(newQ.getAnswer().getAnswer());
		 

		tx.commit();
		session.close();
		factory.close();

	}

}
