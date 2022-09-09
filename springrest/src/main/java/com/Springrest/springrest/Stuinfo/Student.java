package com.Springrest.springrest.Stuinfo;

public class Student 
{
	private long id;
	private String Name;
	private String Address;
	public Student(long id, String name, String address) {
		super();
		this.id = id;
		Name = name;
		Address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	
	
	
}
 