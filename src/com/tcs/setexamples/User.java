package com.tcs.setexamples;

import java.util.Comparator;

public class User implements Comparable<User>{
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return Integer.toString(age);
	}

	@Override
	public int compareTo(User o) {
		
		return o.getAge() - this.getAge();
	}
}
