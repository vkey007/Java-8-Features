package com.in.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SteamDemo {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(25);
		arList.add(5);

		
		
		List<Integer> collect = arList.stream().filter(x -> x>=15).collect(Collectors.toList());
		
		collect.stream().forEach(x -> System.out.println(x));

		
		// without Stream
		/*
		 * List<Integer> findeElements = findeElements(arList); for (Integer i :
		 * findeElements) { System.out.println(i); } }
		 * 
		 * public static List<Integer> findeElements(List<Integer> arList) {
		 * List<Integer> newAl = new ArrayList<Integer>();
		 * 
		 * for (Integer i : arList) { if (i >= 15) { newAl.add(i); }
		 * 
		 * } return newAl;
		 */
	}
}
