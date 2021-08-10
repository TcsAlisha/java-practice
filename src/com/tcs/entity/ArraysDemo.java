package com.tcs.entity;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		numbers[0] = 9;
		numbers[5] = 10;
		Arrays.sort(numbers,0,numbers.length-2);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
