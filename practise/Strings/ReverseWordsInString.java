package practise.Strings;

public class ReverseWordsInString {

		
		public static void main(String[] args) {
			
			String str ="A brave new world";
			
			StringBuilder sb = new StringBuilder();
			
		String[] words = str.trim().split("\\s");
		
		int len = words.length;
		
		for (int i=len-1;i>=0;i--) {
			sb.append(words[i]);
			sb.append(' ');
		}
		
		System.out.println(sb.toString());
		}		

	}
 

