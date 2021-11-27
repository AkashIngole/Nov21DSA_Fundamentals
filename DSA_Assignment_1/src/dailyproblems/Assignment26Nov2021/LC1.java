package dailyproblems.Assignment26Nov2021;

import java.util.Arrays;

public class LC1 {

	 public int[] twoSum(int[] nums, int target) {
	        int[] numsCopy = nums.clone();
	        Arrays.sort(nums);
	        
	        int l = 0;
	        int r = nums.length - 1;
	        
	        while(l < r) {
	            if(nums[l] + nums[r] > target) {
	                r--;
	            } else if (nums[l] + nums[r] < target) {
	                l++;
	            } else {
	                // nums[l] + nums[r] == target
	                break;
	            }
	        }
	        
	       int[] result = {-1, -1};
	        
	        for(int i = 0; i < numsCopy.length; i++) {
	            if(numsCopy[i] == nums[l] && result[0] == -1) {
	                result[0] = i;
	                continue;
	            }
	            if(numsCopy[i] == nums[r] && result[1] == -1) {
	                result[1] = i;
	                continue;
	            }
	        }
	        
	        return result;
	    }
}
