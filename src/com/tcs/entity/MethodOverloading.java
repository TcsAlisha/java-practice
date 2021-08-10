package com.tcs.entity;

public class MethodOverloading {
	public static void main(String[] args)  {
		User1 user1 = new Employee1();
		user1.work();
		user1.work(4);
		user1.work("Hello");
		
	}
}

class User1{
	public void work() {
		System.out.println("Worked ");
	}
	public void work(int duration) {
		System.out.println("Working for " + duration);
	}
	public void work(String duration) {
		System.out.println("Working for " + duration);
	}
}

class Employee1 extends User1{
	@Override
	public void work() {
		
		System.out.println("Working");
	
	
	}
}