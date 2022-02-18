package practise;

// Find all pairs on integer array whose sum is equal to given number

public class SumEqualToGivenNum {

	public static void main(String[] args) {
		int a[]= {1,5,3,14,2,6,4,15};
		int sum=8;
		
		int i=0;
		int temp=0;
		while (i<a.length - 1) {
			 temp = sum - a[i];
			 if (a[i]==temp)
				 continue;
			 if(search(a,temp) == true) {
				 System.out.println("Matched elements:"+a[i]+","+temp);
			 }
			  i++;
		}
		     
	}

	public static boolean search(int[] a, int searchElement) {
		
		int j = 0;
		while (j<a.length) {
			
			if (a[j]==searchElement) {
				return true;
			}

			else {
			
			  j++;
			}
		}
	
		return false;		
	}
}
