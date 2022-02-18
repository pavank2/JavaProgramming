package practise.Arrays;

import java.util.Arrays;

public class CommonElements3Arrays {

	public static void main(String[] args) {
		int[] a = {1, 5, 10, 20, 40, 80};
		int[] b = {6, 7, 20, 80, 100};
		int[] c = {3, 4, 15, 20, 30, 70, 80, 120};
		
		int alen=a.length,blen=b.length,clen=c.length;
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		int i=0,j=0,k=0;
		
		while (i<alen && j<blen && k<clen) {
			
			if (a[i]<b[j])
				i++;
			else if (a[i]>b[j])
				j++;
			else {
				if (a[i]<c[k]){
					i++;
					j++;
				} else if (a[i]>c[k])
					k++;
				else {
					System.out.println(a[i]);
					i++;
					j++;
					k++;
				}
                  
			  }		
					
			}
			
		}

	}


