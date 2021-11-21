package dailyproblems.Assignment19Nov2021;

public class ReverseWordsInString {

	 public static String reverseWords(String s) {
         String [] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int end = words.length - 1;
        for(int i = 0; i<= end; i++){
            if(!words[i].isEmpty()) {
                sb.insert(0, words[i]);
                if(i < end) sb.insert(0, " ");
            }
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		String s = "the sky is blue";
		System.out.println(s);
		
		System.out.println(reverseWords(s));

	}

}
