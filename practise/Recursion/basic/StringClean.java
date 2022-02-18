package practise.Recursion.basic;

//stringClean("yyzzza") → "yza"
public class StringClean {

	public static void main(String[] args) {
		 String s = "XXXeXefAbbbcXcYX";
			System.out.println(stringClean(s));

		}
		
		
		public static String stringClean(String s) {
			
			
			if (s.length() == 0 || s.length() == 1) {
				return s;
			}
			
			
			if (s.charAt(0) == s.charAt(1))
				return stringClean(s.substring(1));
			else
				return s.charAt(0)+stringClean(s.substring(1));
		}
}
