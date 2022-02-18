package practise.Recursion.basic;

//We'll say that a "pair" in a string is two instances of a char separated by a char. 
//So "AxA" the A's make a pair. Pairs can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x.

public class CountPairs {

	public static void main(String[] args) {
		 String s = "XeXefAbcXcYX";
			System.out.println(countPairs(s));

		}
		
		
		public static int countPairs(String s) {
			
			
			if (s.length() == 0 || s.length() == 1 || s.length() == 2) {
				return 0;
			}
			
			
			if (s.charAt(0) == s.charAt(2))
				return 1+countPairs(s.substring(1));
			else
				return countPairs(s.substring(1));

	}
	

}
