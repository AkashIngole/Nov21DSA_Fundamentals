package dailyproblems.Assignment15Nov2021;

import java.util.Arrays;

public class SearchInRotatedSortedArray {

	public static int search(int[] A, int target) {
        int lo = 0;
   int hi = A.length - 1;
   while (lo < hi) {
       int mid = (lo + hi) / 2;
       if (A[mid] == target) return mid;
       
       if (A[lo] <= A[mid]) {
           if (target >= A[lo] && target < A[mid]) {
               hi = mid - 1;
           } else {
               lo = mid + 1;
           }
       } else {
           if (target > A[mid] && target <= A[hi]) {
               lo = mid + 1;
           } else {
               hi = mid - 1;
           }
       }
   }
   return A[lo] == target ? lo : -1;
   }
	public static void main(String[] args) {
		
		int[] nums = {4,5,6,7,0,1,2};
		int target = 0;
		
		System.out.println(Arrays.toString(nums));
		System.out.println(search(nums, target));
		

	}

}
