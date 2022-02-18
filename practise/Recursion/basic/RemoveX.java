package practise.Recursion.basic;

//Given a string, compute recursively a new string where all the 'x' chars have been removed.
public class RemoveX {

	public static void main(String[] args) {
	  
	String s = "XXeferYXyiuyiYX";
		
		
		
		System.out.println(removeX(s));

	}
	
	public static String removeX(String s) {
		
		
		if (s.length() == 0) {
		//	System.out.print(s);
			return s;
		}
		int n = s.length();
		
		if (s.charAt(0)=='X')
			return removeX(s.substring(1));
		else
			return s.charAt(0)+removeX(s.substring(1));
		
	}

}
