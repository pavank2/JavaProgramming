package main.java;

public class MoveAllNegativesToEnd {

	public static void main(String[] args) {
	int[] a = {3,-3,9,-2,3,-23,34};
	int j=a.length-1;
	int i=0;
	
	while (i<j) {
		if (a[i] < 0 && a[j]>0) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		} else if (a[i] > 0 && a[j] >0)
			i++;
		else if (a[i] < 0 && a[j] <0)
			j--;
		else {
			i++;
			j--;
		}
			
	}

	for (i=0;i<a.length;i++)
		System.out.println(a[i]);
	}

}
