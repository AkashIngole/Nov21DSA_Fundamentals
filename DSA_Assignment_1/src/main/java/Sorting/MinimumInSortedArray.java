package main.java.Sorting;

public class MinimumInSortedArray {
	
	public static int findMinSortedRotatedArray(int[] arr) {
		int array_min = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				array_min = arr[i + 1];
			}
		}
		
		return array_min;
	}

	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4};
		System.out.println("Minimum element in sorted-rotated array is " + findMinSortedRotatedArray(arr));
	}

}
