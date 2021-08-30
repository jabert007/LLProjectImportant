package com.jed.lemu.entity;

import java.sql.Timestamp;

public class Person {
	
	private int id;
	private String name;
	private String location;
	private Timestamp birthdate;
	
	public Person() {
		
	}
	
	public Person(int id, String name, String location, Timestamp birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthdate = birthdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Timestamp getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Timestamp birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location + ", birthdate=" + birthdate + "]";
	}
	
	
	
	

}
