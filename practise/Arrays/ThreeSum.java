
/*Given an integer array nums, 
return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, 
and nums[i] + nums[j] + nums[k] == 0.*/
package practise.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		
		int[] a = {-1,0,1,2,-1,-4};
		HashSet<Integer> s = new HashSet<Integer>();
		
	  for (int i:a) {
		  s.add(i);
	  }
		
		int k=0;
		int sum=0;              //nums[i] + nums[j] + nums[k] == 0
		int flag=0;
		for (int i=0;i<a.length-2;i++) {
			for (int j=i+1;j<a.length;j++) {
				if (i!=j) {
					
					k=sum-a[i]-a[j];
					
					if (k!=a[i] && k!=a[j] && s.contains(k)) {
						System.out.println(a[i]+", "+a[j]+", "+k);
					
					}
//					else {
//					 s.add(a[j]);
//					}
//					
				}
					
			}
			
		
			}
		}

	}


