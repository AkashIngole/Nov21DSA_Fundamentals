package main.java.Arrays;

import java.util.Arrays;

public class SegregateEvenOdd {

	public static void segregateArray(int[] arr) {
		int evenPointer = 0;
		int oddPointer = arr.length - 1;
		
		while(evenPointer < oddPointer) {
			if(isEven(arr[evenPointer]) && isOdd(arr[oddPointer])) {
				evenPointer++;
				oddPointer--;
			} else if (isEven(arr[evenPointer]) && isEven(arr[oddPointer])) {
				evenPointer++;
			} else if (isOdd(arr[evenPointer]) && isOdd(arr[oddPointer])) {
				oddPointer--;
			} else {
				// isOdd(arr[evenPointer]) && isEven(arr[oddPointer])
				int temp = arr[evenPointer];
				arr[evenPointer] = arr[oddPointer];
				arr[oddPointer] = temp;
				evenPointer++;
				oddPointer--;
			}
		}
	}
	
	public static boolean isEven(int n) {
		return n%2 == 0;
	}
	
	public static boolean isOdd(int n) {
		return n%2 != 0;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Original Array is: " + Arrays.toString(arr));
		segregateArray(arr);
		System.out.println("Modified Array is: " + Arrays.toString(arr));

	}

}
