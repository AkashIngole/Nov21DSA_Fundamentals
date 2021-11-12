package main.java.Arrays;

public class BinarySearch {

	public static int binarySearch(int[] arr, int target) {
		int result = -1;
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(target < arr[mid]) {
				high = mid - 1;
			} else if (target > arr[mid]) {
				low = mid + 1;
			} else {
				result = mid;
				return result;
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 6, 8, 28, 44, 51, 59, 66, 69, 71};
		int target = 3;
		
		int found_pos = binarySearch(arr, target);
		System.out.println(target + " found at position " + found_pos);
	}

}
