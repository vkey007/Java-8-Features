package com.in.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortingDescendingOrder {

	public static void main(String[] args) {
		
		
		List<Integer> arList = new ArrayList<Integer>();
		
		arList.add(60);
		arList.add(20);
		arList.add(15);
		arList.add(56);
		arList.add(20);
		arList.add(23);
		
		

		
		/*Stream<Integer> sorted = arList.stream().filter(i -> i >= 20).sorted();
		sorted.forEach(x ->System.out.println(x));
*/
		Stream<Integer> newFilteredList = arList.stream().filter(i -> i >= 20).sorted((i1,i2) -> i2.compareTo(i1));
		newFilteredList.forEach(x ->System.out.println(x));
		
	}
}
