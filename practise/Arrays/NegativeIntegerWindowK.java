package practise.Arrays;

//Given an array A[] of size N and a positive integer K, 
//find the first negative integer for each and every window(contiguous subarray) of size K.
public class NegativeIntegerWindowK {

	public static void main(String[] args) {
		int a[] = {-8, 2, 3,1, -6, 10};
		int k=2;
		
		int n=a.length;
		int j=0;
		for (int i=0;i<n-k+1;i++) {
			j=i;
			while (j<i+k) {
				if (a[j] < 0) {
					System.out.println(a[j]);
				     break;
				}
				j++;
				if (j == i+k)
					System.out.println("No negative num in current window");
			}

	}

	}
}
