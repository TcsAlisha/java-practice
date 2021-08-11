package com.tcs.exceptions;

public class EceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("Dividion by 0 is not allowed");
		}
		
	}
}
