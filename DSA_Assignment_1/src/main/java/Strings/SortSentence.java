package main.java.Strings;

public class SortSentence {
	
	public static String sortSentence(String s) {
		String[] input = s.split(" ");
		String[] output = new String[input.length];
		
		for(int i = 0; i < input.length; i++) {
			String x = input[i]; 
            int xEnd = x.length()-1; 
            int idx  = Integer.parseInt(String.valueOf(x.charAt(xEnd))) - 1; 
            output[idx] = x.substring(0,xEnd); 
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < output.length; i++) {
			sb.append(output[i]);
			if(i < output.length - 1) {
				sb.append(" ");
			}
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		String s1 = "is2 sentence4 This1 a3";
		String s2 = "Myself2 Me1 I4 and3";
		
		System.out.println("Input: " + s1);
		System.out.println("Output: " + sortSentence(s1));
		
		System.out.println("Input: " + s2);
		System.out.println("Output: " + sortSentence(s2));
	}

}
