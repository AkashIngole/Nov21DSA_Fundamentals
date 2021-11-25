package main.java.Strings;

import java.util.*;

public class Users implements Comparable<Users>{
	String name;
	int age;
	
	Users(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Users user) {
		return this.age - user.age;
	}
	
	public static void main(String[] args) {
		List<Users> usersList = new ArrayList<>();
		
		usersList.add(new Users("Akash", 25));
		usersList.add(new Users("Ram", 22));
		usersList.add(new Users("Rajesh", 28));
		
		Collections.sort(usersList);
		
		for(Users user : usersList) {
			System.out.println(user.age);
		}

	}

}
