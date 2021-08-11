package com.tcs.exceptions;

public class EceptionDemo {
	public static void main(String[] args) {
		try {
			demo2();
		} catch (MyCheckedException e) {
			e.printStackTrace();
		}
		//		demo1();
		
	}
	private static void demo2() throws MyCheckedException{
		throw new MyCheckedException();
	}
	
	private static void demo1() {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("Dividion by 0 is not allowed");
		}
	}
	
}
