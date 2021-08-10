package com.tcs.entity;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		EnhancedForLoopDemo();
	}
	public static void EnhancedForLoopDemo() {
		int[] numbers = {3,4,-1,2,6};
		for (int number:numbers) {
			
		}
	}
	public static void demo1() {
		int[] numbers = new int[10];
		numbers[0] = 9;
		numbers[5] = 10;
		Arrays.sort(numbers,0,numbers.length-2);
		for (int count = 0; count < numbers.length; count++) {
			System.out.println(numbers[count]);
		}
	}
}
