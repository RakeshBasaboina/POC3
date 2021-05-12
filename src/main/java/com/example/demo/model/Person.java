package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	private int personid;
	private String fname;
	private String lname;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int personid, String fname, String lname) {
		super();
		this.personid = personid;
		this.fname = fname;
		this.lname = lname;
	}

	public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
}
