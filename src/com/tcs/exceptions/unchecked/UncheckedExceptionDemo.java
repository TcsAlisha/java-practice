package com.tcs.exceptions.unchecked;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		User user = new User();
		user.age=80;
		user.work();
	}
}
class User{
	int age= 10;
	public void work() {
		if(age<=18) {
			throw new MyUncheckedException("No child labour");
		}
		else if(age>50) {
			throw new OverAgeException("No oldies allowed");
		}
	}
}