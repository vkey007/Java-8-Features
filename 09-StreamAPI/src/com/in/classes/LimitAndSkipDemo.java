package com.in.classes;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkipDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9,10);
		
		System.out.println("Use of Limit(n)");
		list.stream().limit(4).forEach(x -> System.out.println(x));
		
		System.out.println("Use of  Skip(n) ");
		
		list.stream().skip(4).forEach(x -> System.out.println(x));
	}
	
}
