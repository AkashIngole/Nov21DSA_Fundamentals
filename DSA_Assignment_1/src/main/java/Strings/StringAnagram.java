package main.java.Strings;

public class StringAnagram {

	public static boolean isAnagram(String original, String anagram) {
		if(original.length() != anagram.length()) {
			return false;
		}
		
		int[] freq = new int[256];
		
		for(int i = 0; i < original.length(); i++) {
			freq[original.charAt(i)]++;
		}
		
		for(int i = 0; i < anagram.length(); i++) {
			freq[anagram.charAt(i)]--;
		}
		
		for(int i = 0; i < freq.length; i++) {
			if(freq[i] != 0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		String original = "akash";
		String anagram = "ahska";
		String notAnagram = "yaksh";
		
		System.out.println("Are " + original + " & " + anagram + " anagrams? " + isAnagram(original, anagram));
		
		System.out.println("Are " + original + " & " + notAnagram + " anagrams? " + isAnagram(original, notAnagram));

	}

}
