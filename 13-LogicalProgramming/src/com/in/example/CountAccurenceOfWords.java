package com.in.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountAccurenceOfWords {

	public static void main(String[] args) {
		
		String str = "welcome to code decode and code decode welcome you";
		
	  List<String> asList = Arrays.asList(str.split(" "));
	  System.out.println(asList);
	  
	  Map<String, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
	  
	  System.out.println(collect);
	}
}
