package com.in.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		
		List<Integer> arList = new ArrayList<Integer>();
		
		arList.add(20);
		arList.add(15);
		arList.add(20);
		arList.add(23);
		
		
		//get Stream object
		
		Stream<Integer> openStream = arList.stream();
		//configureing stream by filtering out required values
		
		Stream<Integer> filteredStream = openStream.filter(i -> i>=5);
		List<Integer> collect = filteredStream.collect(Collectors.toList());
		
		collect.stream().forEach(x ->System.out.println(x));
		
		System.out.println("Now in single line");
		
		//What we have done
				// 1) open stream with .stream()
				// 2) use lambda expression  in filter to filter out required object from the open stream.
				//3) Collect all filtered elements and add them to a new list called newFilteredList
		
		List<Integer> newFilteredList = arList.stream().filter(i -> i>=5).collect(Collectors.toList());
		newFilteredList.forEach(x->System.out.println(x));
		
		
		
	}
}
