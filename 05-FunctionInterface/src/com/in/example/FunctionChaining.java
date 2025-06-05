package com.in.example;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		
		Function<Integer ,Integer> doubleIt = i -> 2*i;
		System.out.println("double Function :- " + doubleIt.apply(4));
		
		Function<Integer, Integer > cubeIt = i -> i*i*i;
		System.out.println("Cube Function :- " + cubeIt.apply(4));
		
		System.out.println("First Doubling and that result is cube: " + doubleIt.andThen(cubeIt).apply(2));
		
		System.out.println("First Cubing and that resul is cube : " + doubleIt.compose(cubeIt).apply(2));
		
	}
}
