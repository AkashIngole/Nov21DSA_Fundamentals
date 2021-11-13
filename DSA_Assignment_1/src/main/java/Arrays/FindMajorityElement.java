package main.java.Arrays;

/*	Boyer–Moore majority vote algorithm
 * The algorithm processes each element of the sequence, one at a time. When processing an element x,

	If the counter is 0, set the current candidate to x, and set the counter to 1.
	If the counter is non-zero, increment or decrement it according to whether x is a current candidate.
	At the end of this process, if the sequence has a majority, it will be the element stored by the algorithm. 
	
	If there is no majority element, the algorithm will not detect that fact and may output the wrong element. 
	In other words, the Boyer–Moore majority vote algorithm produces correct results only when the majority element
	 is present in the input.
 * 
 */

public class FindMajorityElement {
	
	public static int findMajorityElement(int[] arr) {
		int result = -1;
		int counter = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(counter == 0) {
				result = arr[i];
				counter++;
			} else if (result == arr[i]) {
				counter++;
			} else {
				counter--;
			}
		}
		
		int verify_counter = 0;
		for(int i = 0; i < arr.length; i++) {
			if(result == arr[i]) {
				verify_counter++;
			}
		}
		
		if(verify_counter >= (arr.length / 2))
			return result;
		else
			return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 8, 7, 4, 18, 21, 2, 2, 12, 11, 10 };
		
//		int[] arr = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
		 
        System.out.println("The majority element is " + findMajorityElement(arr));

	}

}
