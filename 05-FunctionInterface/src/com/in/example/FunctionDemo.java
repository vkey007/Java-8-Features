package com.in.example;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer ,Integer> f =i -> i*i;
		System.out.println("Square of 5 is :- " +f.apply(5));
	}
}
