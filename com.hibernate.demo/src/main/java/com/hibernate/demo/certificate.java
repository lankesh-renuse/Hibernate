package com.hibernate.demo;

import javax.persistence.Embeddable;

@Embeddable
public class certificate {
	
	private String course ;
	private String duretion ;
	

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDuretion() {
		return duretion;
	}

	public void setDuretion(String duretion) {
		this.duretion = duretion;
	}

	public certificate(String course, String duretion) {
		super();
		this.course = course;
		this.duretion = duretion;
	}

	public certificate() {
		super();
		
	}
	
	

}
