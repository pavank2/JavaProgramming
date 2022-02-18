package practise.DynamicProgramming;

public class LongestPalindrome {

	public static void main(String[] args) {

			   
			   String s="aaabbbaaba";
			   int n=s.length();
			   int start=0,maxlength=0;
			   
			   boolean[][] ls = new boolean[n][n];
			   
			  
			   
			  
			   for (int i=0;i<n;i++){
			     ls[i][i]=true;
			     maxlength=1;
			   }
			   
			 for (int i=0;i<n-1;i++){
			    if (s.charAt(i) == s.charAt(i+1)){
			      ls[i][i+1]= true;
			      start=i;
			      maxlength=2;
			    }
			 }
			   
			  int j=0;
			   int k=0;
			   
			  for (k=3;k<n;k++){
			    
			    for (int i=0;i<n-k+1;i++){
			     
			      j=i+k-1;
			      
			      if (s.charAt(i) == s.charAt(j) && ls[i+1][j-1] == true){
			        ls[i][j] = true;
			      }
			        if (k > maxlength){
			          start=i;
			          maxlength=k;
			      }
			   }
			 }  
			        
			  System.out.println(s.substring(start,start+k-1));    
			   
			        
			   
			  }

}
