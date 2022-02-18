package practise;

public class KthSmallestElement {

	public static void main(String[] args) {
		
		int k = 2;
		int[] a = {34, 20, 101, 89, 23, 6, 19, 32,18};
		int smallest;
		int secondSmallest;

		 
		if (a[0] <= a[1]) {
			smallest = a[0];
			 secondSmallest = a[1];
		} else {
			smallest = a[1];
			secondSmallest = a[0];
		}
		
		int i=2;
		while (i<a.length ) {
			
			if (a[i] < smallest) {
				secondSmallest = smallest;
				smallest = a[i];
			}
			
			else if (a[i] > smallest && a[i] < secondSmallest) {
				secondSmallest = a[i];
			}
			
			i++;
		  }
		
		System.out.println("Second smallest:"+ secondSmallest);
		}
		
}
