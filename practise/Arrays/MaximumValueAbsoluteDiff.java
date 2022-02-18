package practise.Arrays;

import java.util.Arrays;

//Given an array, we need to find the maximum sum of absolute 
//difference of any permutation of the given array.

public class MaximumValueAbsoluteDiff {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 4, 8 };
		
		int len = a.length;
		int[] b = new int[len];
		
		Arrays.sort(a);
		int j=0;
		for (int i=0;i<(len)/2;i++) {
			
			b[j++]=a[i];
		
			b[j++] = a[len-1-i];
		}
       
		int maxDiff=0;
		for (int i=0;i<len-1;i++) {
		maxDiff += Math.abs(b[i]-b[i+1]);
		}
		maxDiff +=Math.abs(b[0]-b[len-1]);
		
		System.out.println(maxDiff);
	}

}
