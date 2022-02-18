package practise.Arrays;

//Given an array A[] of N positive integers. 
//The task is to find the maximum of j - i subjected to the constraint of A[i] <= A[j].

public class MaximumIndex {

	public static void main(String[] args) {
		
		int[] a= {34, 8, 10, 3, 2, 80, 30, 1};
		
		int i=0,j=a.length-1;
		int maxdiff = 0;
		
		
			
		for (i=0;i<a.length;i++) 
			for (j=a.length-1;j > i;j--) 
				
				if (a[i] <=a[j] && maxdiff < (j - i)) 
					maxdiff = j-i;
				
				
	    System.out.println(maxdiff);
			}
	
	 
		}

	

