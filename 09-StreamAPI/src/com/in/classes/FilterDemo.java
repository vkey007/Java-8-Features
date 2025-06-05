package com.in.classes;

import java.util.ArrayList;

public class FilterDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arList = new ArrayList<Integer>();
		
		arList.add(20);
		arList.add(25);
		arList.add(52);
		arList.add(17);
		arList.add(18);
		arList.add(32);
		arList.add(64);
		/*
		 * Stream<Integer> filter = arList.stream().filter(i ->i %2==0);
		 * filter.forEach(x -> System.out.println(x));
		 */
		
		arList.stream().filter(i ->i %2 == 0).forEach(x -> System.out.println(x));
		
	}
}
