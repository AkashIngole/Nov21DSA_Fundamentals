package main.java.Arrays;

import java.util.Arrays;

public class MoveZeroToEndInArray {

	public static void moveZeroToEnd(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		
		while(i <= j) {
			if(arr[i] != 0 && arr[j] == 0) {
				i++;
				j--;
			} else if (arr[i] == 0 && arr[j] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			} else if (arr[i] != 0 && arr[j] != 0) {
				i++;
			} else {
				j++;
			}
		}
		
	}
	public static void main(String[] args) {

		int[] arr = {0, 1, 2, 2, 3, 0, 4, 0, 5};
		System.out.println("Original Array: " + Arrays.toString(arr));
		moveZeroToEnd(arr);
		System.out.println("Modified Array: " + Arrays.toString(arr));

	}

}
