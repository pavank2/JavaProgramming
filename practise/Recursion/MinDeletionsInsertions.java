
package practise.Recursion;

/* Given two strings str1 and str2. The task is to remove or insert the minimum number
of characters from/in str1 so as to transform it into str2. It could be possible that 
the same character needs to be removed/deleted from one point of str1 and inserted to
 some another point. */

public class MinDeletionsInsertions {

	public static void main(String[] args) {
	
		String str1 = "heap",str2="plella";
		minOperations(str1,str2);

	}
	
	public static void minOperations(String str1,String str2) {
		
		int m = str1.length();
		int n = str2.length();
		
		int lcsSize = lcs(str1,str2,m,n);
		
		System.out.println("Min deletions:"+ (m - lcsSize));
		System.out.println("Min Insertions:"+ (n - lcsSize));
	}
	
	
	public static int lcs(String str1, String str2, int x,int y) 
	{ 
	    
		if (x==0 || y == 0)
			return 0;
		
		
		if (str1.charAt(x-1) == str2.charAt(y-1))
			return 1+lcs (str1,str2,x-1,y-1);
		else
			return Math.max(lcs(str1,str2,x-1,y),lcs(str1,str2,x,y-1));
	} 

}
