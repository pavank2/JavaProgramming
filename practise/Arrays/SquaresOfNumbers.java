package practise.Arrays;
//Given a sorted array of numbers,return a sorted array with squares of the numbers 

public class SquaresOfNumbers {

	public static void main(String[] args) {
		
		int[] a = {-4,-1,0,3,10};
		int j=0,k=0;
		int splitPoint=0;
		for (int i=0;i<a.length;i++) {
			
			if (a[i] >=0) {
				splitPoint=i;
				
				break;
				
		   }
		}	
			int blength= a.length-splitPoint;
			int[] b = new int[blength];
			int[] c = new int[a.length -blength];
			int clength = c.length;
			for (int i=splitPoint;i<a.length;i++)  
			{
				b[j]=a[i]*a[i];       //All non-negative squared in one array
				j++;
				
			}			                
					
			for (int i=splitPoint-1;i>=0;i--) {
				c[k]=a[i]*a[i];                      //All negatives squared in one array
				
				
				 k++;
			}
		
			int d[] = new int[a.length];
			//Merge both sorted arrays
			int i=0;j=0;k=0;
	     		while (j<blength && k<clength) {
	     			
	     			if (b[j]<c[k]) 
	     				
	     				d[i++]=b[j++];
	     				
	     			 else 
	     				d[i++] = c[k++];
	     		}
	     			
	     			
	     			while (j<blength)
	     				d[i++]=b[j++];
	     			
	     			while (k<clength)
	     				d[i++]=b[k++];
	     			
	     		
			
	for (i=0;i<d.length;i++) 
		
		
			System.out.println(d[i]);
			
	}
	}


