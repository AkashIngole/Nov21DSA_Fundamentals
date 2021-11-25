package main.java.Strings;

import java.util.*;
import java.util.stream.Collectors;

public class FilterString {

	public static void main(String[] args) {
		List<String> namesList = new ArrayList<>();
		namesList.add("Akash");
		namesList.add("Ram");
		namesList.add("Rajesh");
		namesList.add("Vinod");
		
		System.out.println(namesList.toString());
		
		List<String> modifiedList = namesList.stream().filter(name -> name.startsWith("R")).collect(Collectors.toList());
		
		System.out.println(modifiedList.toString());

	}

}
