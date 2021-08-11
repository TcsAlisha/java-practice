package com.tcs.statickeyword;

public class StaticBlockDemo {
	private static int age=10;
	int price=20;
	public void StaticBlockDemo() {
		System.out.println("In the constructor");
	}
	static {
		final int localvariable=90;
		System.out.println(age +" "+ localvariable);
	}
	public static void main(String[] args) {
//		StaticBlockDemo blockdemo =  new StaticBlockDemo();
//		new StaticBlockDemo();
	}
	void work() {
		int time = 45;//wont work for local variable, cant be static
	}
}
