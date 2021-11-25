package dailyproblems.codeSharedByEducators;

import java.util.*;

public class BinaryTreeArrays {
	
	static char arr[] = new char[15];
	
	
	static void root(char val) {
		if(arr[0]!='-') System.out.println("Root already set!");
		else arr[0] = val; 
	}
	
	static void set_Left(char val, int par) {
		if(arr[par]=='-') System.out.println("Cannot set val for unknown parent");
		else {
			int idx = (par*2)+1;
			arr[idx] = val;
		}
	}
	
	static void set_Right(char val, int par) {
		if(arr[par]=='-') System.out.println("Cannot set val for unknown parent");
		else {
			int idx = (par*2)+2;
			arr[idx] = val;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.fill(arr,'-');
		
		root('A');
		set_Left('B', 0);
		set_Right('C', 0);
//		set_Right('D', 3);
		
		root('X');
		
		for(char x:arr) {
			System.out.print(x+",");
		}
		

	}

}
