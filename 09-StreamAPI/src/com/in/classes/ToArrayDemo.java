package com.in.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayDemo {

	public static void main(String[] args) {
		
		
		List<Integer> arList = new ArrayList<Integer>();
		
		arList.add(60);
		arList.add(20);
		arList.add(15);
		arList.add(56);
		arList.add(20);
		arList.add(23);
		
		

		Object[] array = arList.stream().filter(i -> i >=20).toArray();
		for(Object o : array) {
			System.out.println("elements in array is " + o);
		}

	}
}
