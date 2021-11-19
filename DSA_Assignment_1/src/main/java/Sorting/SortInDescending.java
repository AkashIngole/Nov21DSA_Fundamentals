package main.java.Sorting;

import java.util.Arrays;

public class SortInDescending {
	
	public static void descendingSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -arr[i];
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -arr[i];
		}
	}

	public static void main(String[] args) {
		int[] arr = {5, 6, 1, -7, 8, -5, 9, 12, -98, -45, 77 };
		System.out.println("Original Array is: " + Arrays.toString(arr));
		descendingSort(arr);
		System.out.println("Modified Array is: " + Arrays.toString(arr));
	}

}
