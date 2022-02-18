package practise.Arrays;

import java.util.HashMap;

//Count distinct elements in every window
public class CountDistinctElementsWindow {

	public static void main(String[] args) {
		int a[] = {1,2,3,1,1,4};
		int k=3;
		
		int count=0;
		for (int i=0;i<a.length-k+1;i++) {
			int j=0;
			for (j=i+1;j<i+k;j++) {
				if (a[i]==a[j]) {
					break;
				}
				
				
				}
			 if (j-i==k)
				count++;
                   
			} 
				
				
			System.out.println(count);
			
		}
		

	}

