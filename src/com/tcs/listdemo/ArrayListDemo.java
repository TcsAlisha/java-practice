package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
		// SortList(numbers);
		// FilterList(numbers);
		//AddNumbers(numbers);
		otherOps(numbers);
	}
	
	private static void otherOps(List<Integer> numbers) {
		System.out.println(numbers);
		//numbers.remove(11);
		numbers.add(4,80);
		System.out.println(numbers);
	}

	private static void AddNumbers(List<Integer> numbers) {
		Optional<Integer> sum1 =numbers.stream()
				.reduce((Integer sum, Integer number) -> {
					System.out.println(sum+" "+number);
					return sum + number;
				});
				System.out.println(sum1.get());
	}
	
	private static void FilterList(List<Integer> numbers) {
		numbers.forEach((number) -> {
			System.out.println(number % 2 == 0);
			// break;
		});
		List<Integer> filtered = numbers.stream().filter((number) -> number % 2 == 0).collect(Collectors.toList());
		System.out.println(filtered);
	}

	private static void SortList(List<Integer> numbers) {
		System.out.println(numbers);
		numbers.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;// desc
			}
		});
		System.out.println("After sorting " + numbers);
	}

	private static List<Integer> createList() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		// System.out.println(numbers.get(0));

		for (int count = 0; count < 20; count++) {
			numbers.add(count);
		}
		return numbers;
	}
}
