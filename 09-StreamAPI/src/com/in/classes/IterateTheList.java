package com.in.classes;

import java.util.ArrayList;
import java.util.List;

public class IterateTheList {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
		/*
		 * for (Integer elem : list) { System.out.println(elem); }
		 */
		list.forEach(elem -> {System.out.println(elem);});
	}
	
	
	
}
