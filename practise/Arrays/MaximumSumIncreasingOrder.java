package practise.Arrays;

import java.util.Arrays;

//Given n arrays of size m each. Find the maximum sum obtained by selecting 
//a number from each array such that the elements selected from the i-th array 
//are more than the element selected from (i-1)-th array. 
//If maximum sum cannot be obtained then return 0.
public class MaximumSumIncreasingOrder {

	public static void main(String[] args) {
		int a[][] = {{1, 7, 3, 4},
                {4, 2, 5, 1},
                {9, 5, 1, 8}};
		
		maxSum(a);

	}
	
	public static void maxSum(int[][] a) {
		
		int m = a.length; // number of arrays
		
		for (int i=0;i<m;i++) {
			Arrays.sort(a[i]);
		}
		
		int lastlen = a[m-1].length; //Length of last array
		
		int lastMax = a[m-1][lastlen-1]; //Max element of last array, which is sorted
		
		int maxSum=lastMax;           //Initialize final result
		for (int i=m-2;i>=0;i--) {
			
			for (int j=a[i].length-1;j>0;j--) {
				if (a[i][j] < lastMax) {//Compare with largest element in each sorted array
					System.out.println(a[i][j]);
					lastMax = a[i][j];
					maxSum += lastMax;
					continue;
				}
					
			}
		}
		
		System.out.println(maxSum);
	}

}
