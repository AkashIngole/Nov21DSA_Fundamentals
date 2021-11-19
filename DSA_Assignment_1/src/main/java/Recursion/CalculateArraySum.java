package main.java.Recursion;

public class CalculateArraySum {

	public static int arraySum(int[] arr, int index, int sum) {
		if(index == arr.length) {
			return sum;
		}
		sum += arr[index];
		return arraySum(arr, index + 1, sum);
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 5, 5, 10};
		int start = 0;
		int sum = 0;
		System.out.println("Sum of array elements is " + arraySum(arr, start, sum));
	}

}
