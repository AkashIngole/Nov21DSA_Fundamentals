package dailyproblems.Assignment26Nov2021;

public class LC771 {
	 public int numJewelsInStones(String jewels, String stones) {
	        int[] cnt = new int[128];
	        for (char c : stones.toCharArray())
	            cnt[c]++;
	        int ans = 0;
	        for (char c : jewels.toCharArray())
	            ans += cnt[c];
	        return ans;
	    }

}
