package main.java.Recursion;

public class PrintReverseString {
	
	public static void printReverse(String s, int begin) {
		if(begin == s.length()) {
			return;
		}
		
		printReverse(s, begin + 1);
		System.out.print(s.charAt(begin));
		return;
	}

	public static void main(String[] args) {
		String s = new String("Akash Ingole");
		printReverse(s, 0);

	}

}
