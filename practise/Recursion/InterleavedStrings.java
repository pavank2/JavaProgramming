package practise.Recursion;

public class InterleavedStrings {

	public static void main(String[] args) {
		
		String a = "abc";
		String b = "xyz";
		
		String c = "xaybzc";
		
		System.out.println(isInterLeaved(a,b,c));

	}

	//Corner cases not fully covered
	public static boolean isInterLeaved(String a,String b,String c) {
		
		if (a.length() == 0 && b.length() == 0 && c.length() == 0)
			return true;
		
		if (a.charAt(0) == c.charAt(0))
			return (isInterLeaved(a.substring(1),b.substring(1),c.substring(2)));
		else if (b.charAt(0) == c.charAt(0))
			return (isInterLeaved(b.substring(1),a.substring(1),c.substring(2)));  
		else
			return false;
	}
}
