package com.in.example;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> cheackSumOfTwo = (a , b) -> a+b >=5 ;
		System.out.println(" sum 2 and 2 is greater than 5 : " +cheackSumOfTwo.test(2, 2));
		System.out.println(" sum 2 and 4 is greater than 5 : " +cheackSumOfTwo.test(2, 4));
		
		BiFunction<Integer, Integer, Integer>  multipulBoth = (a,b) -> a*b;
		System.out.println(" Multiplication of 5 and 10 is  : " +multipulBoth.apply(5, 10));
		
	}
}
