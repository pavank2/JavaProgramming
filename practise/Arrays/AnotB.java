package practise.Arrays;

//Given two sorted arrays A & B, list elements in A but not in B
public class AnotB {

	public static void main(String[] args) {
		
		int[] a = {12,17,31,35,38,41,42,50, 65};
		int[] b = {17,19,23,31,40,42,43};
		
		int m = a.length;
		int n = b.length;
		
		int i=0,j=0;
		
		while (i<m & j<n) {
			
			if (a[i]<b[j]) {
				System.out.println(a[i]);
				i++;
			} else if (a[i]>b[j]) {
				j++;
			} else {
				i++;
				j++;
			}
			

			
		
		}
		
		while (i<m) {
			System.out.println(a[i]);
		    i++;
		}	
			
	  }

	}


