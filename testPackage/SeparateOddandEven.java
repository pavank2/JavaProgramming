package testPackage;

public class SeparateOddandEven {

	public static void main(String[] args) {
		
		int[] a= { 2, 3,8,5,1,20, 13,22}; // even first and odds later
		
		int j=a.length-1,i=0;
		
		while (i<=j) {
			
			if ((a[i] %2 == 0) && (a[j]%2 == 1)){
				i++;
				j--;
			} else if ((a[i] % 2 == 1) && (a[j] % 2 == 0))  {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
			}
			else if ((a[i] %2 == 1) && (a[j]%2 == 1))
				j--;
			else
				i++;
			
		}
		
		for (i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
