package practise.Recursion;

/* A number n can be broken into three parts n/2, n/3 and n/4 (consider only integer part). 
Each number obtained in this process can be divided further recursively. 
Find the maximum sum that can be obtained by summing up the divided parts together.*/

public class MaxSum {

	public static void main(String[] args) {
		int n = 24;
		
		System.out.println(maxSum(n));

	}
	
	public static int maxSum(int n) {
		
		if (n==0 || n ==1)
			return n;
		
	
		
		return Math.max(n,maxSum(n/2)+maxSum(n/3)+maxSum(n/4));
		
	}

}
