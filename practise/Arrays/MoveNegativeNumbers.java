package practise.Arrays;

//Move negative numbers to one end in place
public class MoveNegativeNumbers {

	public static void main(String[] args) {
		
		int[] a= {10,-2,-9,2,5,-1,-20,45};
		int j=a.length-1,temp=0;
		int i=0;
	
		while (i!=j) {
			if (a[i] > 0 && a[j] <0) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
              	i++;
              	j--;
			} else if (a[i] > 0 && a[j] > 0) 
				        j--;
			else if (a[i] < 0 && a[j] <0)
				i++;
				
		}
		
		for (i=0;i<a.length;i++)
		  System.out.println(a[i]);

	}

}
