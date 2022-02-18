package practise.Strings;

public class MakeStringPalindrome {

	public static void main(String[] args) {
		String s="baccb";
		
		System.out.println(makePal(s.toCharArray(),0,s.length()-1));

	}
	
	public static int makePal(char[] c,int i,int j) {
		
		if (i > j)
			return Integer.MAX_VALUE;
		 if (i == j)
			 return 0;
		 if (i == j-1)
			 return (c[i] == c[j-1])?0:1;
		
		
		 if (c[i] == c[j])
			 return makePal(c,i+1,j-1);
		 else
			 return 1+Math.min(makePal(c,i+1,j),makePal(c,i,j-1));
		
		
		
	}

}
