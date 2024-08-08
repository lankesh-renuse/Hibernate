package com.hibernate.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private long id ;
	private String name ;
	private String city ;
	
	 private certificate certi ;
	
	public Student() {
		super();
		
	}
	public Student(long id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public certificate getCerti() {
		return certi;
	}
	public void setCerti(certificate certi) {
		this.certi = certi;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
