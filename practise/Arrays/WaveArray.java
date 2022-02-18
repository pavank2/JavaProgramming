package practise.Arrays;

import java.util.Arrays;

//Given a sorted array arr[] of distinct integers. 
//Sort the array into a wave-like array and return it

public class WaveArray {

	public static void main(String[] args) {
		
		int a[] = {2,4,7,9,10,12,16};
		
		
		for (int i=0;i<a.length-1;i=i+2) {
			swap(a,i,i+1);
		}
		
		for (int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	
	public static void swap(int[] a, int x,int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y]= temp;
	}

}
