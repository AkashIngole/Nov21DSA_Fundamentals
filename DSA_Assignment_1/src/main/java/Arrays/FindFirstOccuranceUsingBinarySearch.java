package main.java.Arrays;

public class FindFirstOccuranceUsingBinarySearch {

	public static int findFirstOccurance(int[] arr, int target) {
		int result = -1;
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) { 
			int mid = low + (high - low) / 2;
			if(target == arr[mid]) {
				result = mid;
				high = mid - 1;
			} else if (target > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 6, 6, 6, 44, 51, 59, 59, 99, 71};
		int target = 99;
		
		int first = findFirstOccurance(arr, target);
		System.out.println("First occurance of " + target + " is at " + first);

	}

}
