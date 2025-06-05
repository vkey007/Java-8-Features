package com.in.exapmle;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {
		
		Consumer<Integer> squareMe = i -> System.out.println("Taking an input and performing square an opration : " + i*i);
		squareMe.accept(5);
		
		Consumer<Integer> doubleMe = i ->System.out.println("Taking an input and performing double an operation : "+ (i +i));
		doubleMe.accept(5);
		
		squareMe.andThen(doubleMe).accept(5);
	}
}
