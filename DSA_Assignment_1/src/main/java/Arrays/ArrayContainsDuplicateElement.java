package main.java.Arrays;

import java.util.Arrays;

public class ArrayContainsDuplicateElement {

	public static boolean isContainDuplicates(int[] arr) {
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == arr[i + 1]) {
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, 1, 5, 9, 15, 6, 15 };
		System.out.println("Does array contains duplicate elements? " + isContainDuplicates(arr));

	}

}
