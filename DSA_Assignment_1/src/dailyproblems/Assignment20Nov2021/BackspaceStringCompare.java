package dailyproblems.Assignment20Nov2021;

// https://leetcode.com/problems/backspace-string-compare/

public class BackspaceStringCompare {

	public static boolean backspaceCompare(String s, String t) {
        return getString(s).equals(getString(t));
    }
    
     public  static String getString(String str) {
        int n=str.length(), count=0;
        String result="";
        for(int i=n-1; i>=0; i--) {
            char ch=str.charAt(i);
            if(ch=='#') 
                count++;
            else {
                if(count>0)
                    count--;
                else {
                    result+=ch;
                }                     
            }
        }
        return result;
    }
    
	public static void main(String[] args) {
		String s = "ab#c";
		String t = "ad#c";
		System.out.println(backspaceCompare(s, t));
		
		s = "a#c";
		t = "b";
		System.out.println(backspaceCompare(s, t));
		
		

	}

}
