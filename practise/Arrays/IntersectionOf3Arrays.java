package practise.Arrays;

import java.util.ArrayList;

public class IntersectionOf3Arrays {

	public static void main(String[] args) {
         
		int[] a = {1,2,5,5,7,9, 12,18,22};
		int[] b = {1,5,9,12, 22,33};
		int[] c = {2,9,22, 45};
   ArrayList<Integer> al = new ArrayList<Integer>();
		
		int alen = a.length;
		int blen = b.length;
		int clen = c.length;
		
		int i=0,j=0,k=0;
		
		while (i < alen && j < blen ) {
			
			if (a[i]==b[j]  ) {
				al.add(a[i]);
				i++;
				j++;
			} else if (a[i] < b[j]) 
				i++;
			 else
				j++;
				
		}
		
		
		while (k < clen) {
			if (al.indexOf(c[k])!=-1)
				System.out.println(c[k]);
			k++; 
		}
		
	}

}
