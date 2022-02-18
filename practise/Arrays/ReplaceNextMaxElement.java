package practise.Arrays;

//Given an array arr, replace every element in that array with the greatest 
//element among the elements to its right, and replace the last element with -1.
public class ReplaceNextMaxElement {

	public static void main(String[] args) {
		
		int[] a = {17,18,5,4,6,18,24,36,48,1};
		int[] b = new int[a.length];
		int currentMax=Integer.MIN_VALUE;
		
		for (int i=a.length-1;i>0;i--) {
			
			if (a[i]> currentMax) {
				b[i-1]=a[i];
				currentMax = a[i];
			}
			else
				b[i-1]=currentMax;
		}
		
		b[b.length-1] = -1;
		
		for (int i=0;i<b.length;i++)
			System.out.println(b[i]);
	}

}
