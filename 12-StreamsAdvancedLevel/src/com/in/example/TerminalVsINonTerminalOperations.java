package com.in.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TerminalVsINonTerminalOperations {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1 , "code1");
		Employee e2 = new Employee(2 , "code22");
		Employee e3 = new Employee(3, "code333");
		Employee e4 = new Employee(4 , "code4444");
		
			List<Employee> eList = Arrays.asList(e1 ,e2, e3, e4);
			
			List<Integer> initList = Arrays.asList(1,2,3,4,5);
			
			initList.stream().filter(a -> a % 2 == 0).map(a -> a+a).filter(a -> a > 5).forEach(x -> System.out.println(x));
			System.out.println(initList.stream().filter(a -> a%2 == 0).map(a -> a+a).filter(a -> a> 5).count());
			
			
		/*
		 * int sum = 0; for(int i =1 ; i<=5; i++) { sum += i ; }
		 * System.out.println(sum);
		 */
			
			
			System.out.println(initList.stream().reduce((a ,b) -> a+b).get());
	}
	
}
	class Employee {
		
		private int id;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Employee(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}
		
		
		public void printName() {
			System.out.println("In employee  class" +name);
		}
		
		
	}

