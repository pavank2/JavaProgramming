package main.java;

public class MinMaxElement {

	public static void main(String[] args) {
		 int[] a = {200, 30,6,20,29,35};

		 int min = a[0],max=a[0];
		 
		 for (int i=1;i<a.length;i++) {
			 if (a[i] < min)
				 min = a[i];
			 else if (a[i] > max)
				 max = a[i];
		 }
		 
		 System.out.println(min+" "+max);
	}

}
