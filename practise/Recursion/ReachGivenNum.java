//Count number of ways to reach a given score in a game
package practise.Recursion;

import java.util.Arrays;

public class ReachGivenNum {

	public static void main(String[] args) {
		
		int n = 42;
		System.out.println(count(n));
		
	    }

	public static long count(int n) {
        long[] dp = new long[(int)n+1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        int i;
        for (i=3;i<=n;i++)
        	dp[i]+=dp[i-3];
        
        for (i=5;i<=n;i++)
        	dp[i]+=dp[i-5];
        
        for (i=10;i<=n;i++)
        	dp[i]+=dp[i-10];
        
        return dp[n];
	
	}

}
