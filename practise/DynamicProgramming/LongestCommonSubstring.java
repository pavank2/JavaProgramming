package practise.DynamicProgramming;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		
		String str1 = "thisisastringnodoubt";
		String str2= "maybepringanyhow";
		
		int m=str1.length();
		int n=str2.length();
//Not working code
//		String maxsofar="";
//		String maxcurrent="";
//		int i=0,j=0;
//		boolean counting=false;
//		while (i<m && j<n) {
//		
//			
//		if (str1.charAt(i)!=str2.charAt(j)) {
//				j++;
//				
//		if (maxsofar.length() < maxcurrent.length() && maxsofar!="" && maxcurrent!="" 
//						||maxcurrent!="")
//					maxsofar=maxcurrent;
//		  // maxcurrent=null;
//			} else { //str1.charAt(i)==str1.charAt(j)
//							
//				maxcurrent = maxcurrent+ Character.toString(str1.charAt(i)) ;
//				j++;
//				i++;
//			
//			}
		int result=0;
		int[][] L = new int[m+1][n+1];
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				
				if (i== 0 || j==0)
					L[i][j]=0;
				
				else if (str1.charAt(i-1)==str2.charAt(j-1)) {
					L[i][j]= L[i-1][j-1]+1;
					result = Math.max(result, L[i-1][j-1]);
				}
				else
					L[i][j]=0;
			}
			
			
		}
		
		System.out.println(result);
		
		}
		


	}


