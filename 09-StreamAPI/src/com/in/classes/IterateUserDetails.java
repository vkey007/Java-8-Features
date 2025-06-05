package com.in.classes;

import java.util.ArrayList;
import java.util.List;

public class IterateUserDetails {

	public static void main(String[] args) {
		
	
	List<User> list = new ArrayList<User>();
	
	list.add(new User("1" , "Vikas"));
	list.add(new User("2" , "Akash"));
	list.add(new User("3" , "Neelam"));
	list.add(new User("4" , "Pinku"));
	
	list.forEach(user ->{
		System.out.println("user Id :" + user.getId());
		System.out.println("user Name : " + user.getName());
	});
}
	
}