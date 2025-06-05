package com.in.example;

import java.util.function.Predicate;

public class PredicateFunctionDemo {

	public static void main(String[] args) {
		
		Predicate<String> p = (str) -> str.length() >=5;
		System.out.println("The length of string is grester then5 : " +p.test("Vika"));
	}
}
