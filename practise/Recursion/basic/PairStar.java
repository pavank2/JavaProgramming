package practise.Recursion.basic;

public class PairStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         String s = "XXeferYXXXyiuyiYX";
		
		
		
		System.out.println(pairStar(s));

	}
	
	public static String pairStar(String s) {
		
		
		if (s.length() == 0 || s.length() == 1) {
			return s;
		}
		
		char ch0 = s.charAt(0);
		char ch1 = s.charAt(1);
		if (ch0 == ch1)
			return pairStar(ch0+"*"+s.substring(1));
		else
			return ch0+pairStar(s.substring(1));
		
	}




}
