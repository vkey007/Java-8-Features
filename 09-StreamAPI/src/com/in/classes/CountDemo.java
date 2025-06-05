package com.in.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDemo {

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
		long count = filteredStream.count();
		
		System.out.println("stream Count" + count);
		
		System.out.println("Now in single line");
		
	
	   long count2 = arList.stream().filter(i -> i>=20).count();
	   System.out.println(count2);
		
		long count3 = arList.stream().count();
		System.out.println(count3);
		
	}
}
