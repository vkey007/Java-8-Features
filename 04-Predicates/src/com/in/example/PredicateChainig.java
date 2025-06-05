package com.in.example;

import java.util.function.Predicate;

public class PredicateChainig {

	public static void main(String[] args) {
		
		Predicate<String> checkLength = str -> str.length() >=5;
		System.out.println("Cheack given string gretter than 5 or not:  "+ checkLength.test("code decode"));
		
		Predicate<String > checkEvenLength = str -> str.length() %2==0;
		System.out.println(""+ checkEvenLength.test("code decode"));
		
		//it can be joined with and
		System.out.println("After merging with and :" + checkLength.and(checkEvenLength).test("code decode"));
		
		//it can be joined with Or
		System.out.println("After merging with Or :" + checkLength.or(checkEvenLength).test("code decode"));
		
		//it can be joined with Negate
		System.out.println("After merging with Neget" + checkLength.negate().test("code decode"));
		
	}
}
