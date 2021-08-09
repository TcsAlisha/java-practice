package com.tcs.entity;

public class User {
	private String name;
	private Long mobilenumber;
	private byte age;

	public void workout() {
		System.out.println(name + "is working out..");

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

		return "[name=" + name + "]";
	}

}
