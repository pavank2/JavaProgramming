package main.java;

import java.util.HashMap;

public class SubArrayGivenSum {

	public static void main(String[] args) {
		int[] a = {1, 4, 20, 3, 10, 5};
		int sum = 33;
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		int currsum=0;
		int i=0;
		for ( i=0;i<a.length;i++) {
			currsum = a[i];
		int p=0;
		for (int j=i+1;j<=a.length;j++) {
		  if (currsum == sum) {
				p=j-1;
				System.out.println(i+" "+p);
				return;
		     }
			
			if (currsum > sum+a[i]||j==a.length)
				break;
			currsum = currsum+a[j];	
		   }
		 }
		
		
		

	}

}
