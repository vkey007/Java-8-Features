package com.in.implclasses;

import com.in.interfaces.InterfaceWithArg;

public class Test2 {

	public static void main(String[] args) {
		
		InterfaceWithArg i = (a ,b) -> System.out.println(a+b);
		i.sum(20, 30);
	}
}
