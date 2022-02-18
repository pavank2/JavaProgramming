package practise.Recursion;

//NOT WORKING

public class MinNumOfDeletions {

	public static void main(String[] args) {
      String s="geeksforgeeks";
      
      
      System.out.println(longestPalSubseq(s));
      
//      int minNumofDel = s.length() - l;
//      System.out.println(l+ " "+minNumofDel);
      
	}
	
	public static int longestPalSubseq(String s) {
		if (s.length() == 0) 
			return 0;
		
		if(s.length() == 1)
			return 1;
		//First calculate longest palindromic subsequence
		
		if (s.charAt(0) == s.charAt(s.length()-1))
			return 2+longestPalSubseq(s.substring(1,s.length()-2));
		else
			return Math.max(longestPalSubseq(s.substring(0,s.length()-2)),longestPalSubseq(s.substring(1,s.length()-1)));
		
//		if (str.charAt(i) == 
//                str.charAt(j) && cl == 2)
//            L[i][j] = 2;
//        else if (str.charAt(i) == 
//                      str.charAt(j))
//            L[i][j] = L[i + 1][j - 1] + 2;
//        else
//            L[i][j] = Integer.max(L[i][j - 1],
//                                 L[i + 1][j]);
		
	}

}
