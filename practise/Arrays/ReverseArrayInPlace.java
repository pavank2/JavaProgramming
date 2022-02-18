package practise.Arrays;

public class ReverseArrayInPlace {

	public static void main(String[] args) {
		int[] a = {34, 20, 101, 89, 23, 6, 19, 32,18};
		int temp=0;
		int j = a.length -1;
		
		for (int i=0;i<a.length/2;i++) {
			temp = a[i];
			a[i] = a[j-i];
			a[j-i] = temp;
			
		
		}
		
		for (int i=0;i<a.length - 1;i++) {
			System.out.println(a[i]);
		}

	}

}
