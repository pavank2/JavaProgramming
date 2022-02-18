package practise.DynamicProgramming;

/* Given two strings str1 and str2. The task is to remove or insert the minimum number
of characters from/in str1 so as to transform it into str2. It could be possible that 
the same character needs to be removed/deleted from one point of str1 and inserted to
 some another point. */

public class MinDeletionsInsertionsDP {

	public static void main(String[] args) {
	
		String str1 = "heap",str2="plella";
		System.out.println(minOperations(str1,str2));

	}
	
	public static int minOperations(String str1,String str2) {
		
		int m = str1.length();
		int n = str2.length();
		
		int lcsSize = lcs(str1,str2,m,n);
		
		int minDel = m - lcsSize;
		int minInsert = n - lcsSize;
		
		System.out.println(minDel+" "+minInsert);
		return (minDel+minInsert);
	}
	
	
	public static int lcs(String str1, String str2, int m,int n) 
	{ 
	    
		int L[][] = new int[m+1][n+1];

					
		for (int i=0;i<=m;i++) 
			for (int j=0;j<=n;j++) 
				if (i==0 || j == 0)
					L[i][j]=0;
				else if (str1.charAt(i-1) == str2.charAt(j-1))
					L[i][j] = L[i-1][j-1]+1;
				else
					L[i][j]= Math.max(L[i-1][j],L[i][j-1]);
		
		return L[m][n];
				
				
	} 

}
