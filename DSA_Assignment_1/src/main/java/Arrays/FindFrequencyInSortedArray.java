package main.java.Arrays;

public class FindFrequencyInSortedArray {
	
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
	
	public static int findLastOccurance(int[] arr, int target) {
		int result = -1;
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) { 
			int mid = low + (high - low) / 2;
			if(target == arr[mid]) {
				result = mid;
				low = mid + 1;
			} else if (target > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
		int target = 5;
		int freq = findLastOccurance(arr, target) - findFirstOccurance(arr, target) + 1;
		
		System.out.println("Frequency of " + target + " is " + freq);

	}

}
