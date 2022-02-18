package main.java;

public class Sort012 {

	public static void main(String[] args) {
		
		int[] a = {2,1,0,0,1,2,0,2,1,0,0,1,1};
		int count0=0,count1=0,count2=0;
		
		for (int i=0;i<a.length;i++) {
			if (a[i]==0)
				count0++;
			else if (a[i]==1)
				count1++;
			else
				count2++;
		}
		
		for (int i=0;i<count0;i++)
			a[i]=0;
		
		for (int i=count0;i<a.length-count2;i++)
			a[i]=1;
		
		for (int i=a.length-count2;i<a.length;i++)
			a[i]=2;
		
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
	}
	}
}
