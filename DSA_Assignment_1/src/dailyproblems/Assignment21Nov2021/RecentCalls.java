package dailyproblems.Assignment21Nov2021;

import java.util.*;

class RecentCounter {
    List<Integer> list;
    
    public RecentCounter() {
        list = new ArrayList<>();
    }
    
    public int ping(int t) {
        list.add(t);
        int index = Collections.binarySearch(list, t - 3000); 
        if (index < 0) { 
            index = ~index; 
        }
        return list.size() - index;
    }
}

public class RecentCalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = -9;
		System.out.println(~index);
	}

}
