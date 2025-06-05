package com.in.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxDemo {

	public static void main(String[] args) {
		
		List<Integer> arList = new ArrayList<Integer>();
		
		arList.add(60);
		arList.add(20);
		arList.add(15);
		arList.add(56);
		arList.add(20);
		arList.add(23);
		
		

		Stream<Integer> sorted = arList.stream().sorted((i1, i2) -> i1.compareTo(i2));
		sorted.forEach(x -> System.out.println(x));
		
		System.out.println("&&&&&&&&&&&&&&7");
		
			Integer minValue = arList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
			System.out.println(minValue);
			
			Integer maxValue = arList.stream().max((i1, i2) ->i1.compareTo(i2)).get();
			System.out.println(maxValue);
	}
}
