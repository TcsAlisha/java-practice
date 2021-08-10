package com.tcs.entity;

public class User {
	private String name;
	private Long mobilenumber;
	private Role role;
	private byte age;   //data encapsulation
	
	//constructor
	public void workout() {
		System.out.println(name + "is working out..");
	}
	
	//custom constructor
	public User(String name, int i, byte age) {
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.age = age;
	}
	
	//overloaded constructor
	public User(String name, Long mobilenumber) {
		super(); //call super class constructor
		this.name = name;
		this.mobilenumber = mobilenumber;
		
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "[name=" +name+"]";
	}

}