package practise.DynamicProgramming;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
	
		
		String str1 = "SFWEXCBXDAW";
        String str2= "WBNEMYDIA"	;
        
        char[] A = str1.toCharArray();
        char[] B = str2.toCharArray();
        
        int m = str1.length();
        int n = str2.length();
        
        System.out.println(lcs(A,B,m,n));
 
	}
	
	public static int lcs( char[] X, char[] Y, int m, int n )
	  {
		
	    int L[][] = new int[m+1][n+1];
	  
	     
	    for (int i=0; i<=m; i++)
	    {
	      for (int j=0; j<=n; j++)
	      {
	        if (i == 0 || j == 0)
	            L[i][j] = 0;
	        else if (X[i-1] == Y[j-1])
	            L[i][j] = L[i-1][j-1] + 1;
	        else
	            L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
	      }
	    }
	    
	  //Printing the subsequence  
	    int index= L[m][n];
	    
	    char[] lcs = new char[index+1];
	    lcs[index] = '\u0000';
	    int i=m,j=n;
	   while (i>0 && j>0)
	      {
	        
	        if (X[i-1] == Y[j-1]) {
                lcs[index-1] = X[i-1];
	               i--;
	               j--;
	               index--;
	               
	        }
	        else
	        {
	        	if (L[i-1][j]> L[i][j-1])
	        		i--;
	        	else
	        		j--;
	        }
	            
	      }
	    
	    
	    System.out.println(lcs);
	 //Returning length of subsequence   
	  return L[m][n];
	  }

}
