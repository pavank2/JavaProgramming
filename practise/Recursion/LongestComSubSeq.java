package practise.Recursion;

public class LongestComSubSeq {

	public static void main(String[] args) {
		String s1= "aergerhood";
		String s2 = "awrehd";
		
		System.out.println(lcs(s1,s2,s1.length(),s2.length()));

	}

	public static int lcs(String s1,String s2,int x,int y) {
		
		if (x == 0 || y == 0)
			return 0;
		
		if (s1.charAt(x-1)==s2.charAt(y-1))
			return 1 + lcs (s1,s2,x-1,y-1);
		else 
			return max(lcs(s1,s2,x-1,y),lcs(s1,s2,x,y-1));
	}

	private static int max(int a,int b) {
		return a>b?a:b;
	}
}
