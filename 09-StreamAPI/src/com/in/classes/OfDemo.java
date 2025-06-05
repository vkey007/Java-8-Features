package com.in.classes;

import java.util.stream.Stream;

public class OfDemo {

	public static void main(String[] args) {
		
		Stream.of(1,11,111,1111,11111,111111,1111111).forEach(x -> System.out.println(x));
		
		String[] name = {"Code" ,"Decode" , "Demo"};
		
		Stream.of(name).forEach(x -> System.out.println(x));
		Stream.of(name).filter(i -> i.length() > 4).forEach(x -> System.out.println(x));
		
	}
}
	