package com.in.example;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		/*
		 * SupplierDemo supplierDemo = new SupplierDemo();
		 * System.out.println(supplierDemo.fatchCurrentDate());
		 */
		
		Supplier<Date> date = () -> new Date();
		System.out.println(date.get());
	}
}
