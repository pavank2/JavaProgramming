
//Find number of string subsequences of s2 in s1, continuous or discontinuous
package practise.Recursion;

public class NumOfStringSubsequences {

	public static void main(String[] args) {
		
		String s1 = "geeksforgeeks";
		String s2 = "gks";
		
		System.out.println(countSeq(s1,s2,s1.length(),s2.length()));
		
	}
	
	 public static int countSeq(String s1, String s2,int x,int y){
	     if (x == 0 && y ==0 || y == 0) 
	    	 return 1;
	     
	     if (x==0)
	    	 return 0;
	     
	     if (s1.charAt(x-1) == s2.charAt(y-1))
	    	 return countSeq(s1,s2,x-1,y-1)+countSeq(s1,s2,x-1,y);
	     
	     else
	    	 return countSeq(s1,s2,x-1,y);
		 
		 }
	    

}
