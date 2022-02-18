//Given an array A of positive integers. Your task is to find the leaders in the array. 
//An element of array is leader if it is greater than or equal to all the elements to 
//its right side. The rightmost element is always a leader. 

package practise.Arrays;

import java.util.ArrayList;

public class ArrayLeaders {
	static int[] a = {24, 32, 102, 8, 97, 20,17,36};

	public static void main(String[] args) {
	
		
		
		
		int len = a.length,i=0;
		ArrayList<Integer> leadersList = new ArrayList();
		
		while (i<len) {
			
			if(isGreater(a[i],i,len))
					leadersList.add(a[i]);
			i++;
		}
		
		System.out.println(leadersList);

	}

	public static boolean isGreater(int currentValue,int i,int len) {
		
		for (int j=i+1;j<len;j++)
		{	
			if(currentValue < a[j])
			  return false;
		}
		  
		
		return true;
	}
}

