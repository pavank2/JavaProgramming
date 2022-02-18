package practise.Arrays;

//Given an array which consists of only 0, 1 and 2.
//Sort the array without using any sorting algo
public class SortArray012 {

	public static void main(String[] args) {
		
		int[] a = {2,0,0,1,2,0,1,2,0};
		int zeros=0,ones=0,twos=0;
		
		for (int i=0;i<a.length;i++) {
			if (a[i]==0)
				zeros++;
			else if (a[i]==1)
				ones++;
			else
				twos++;
		}
			for (int i=0;i<zeros;i++)
				a[i]=0;
			
			for (int i=zeros;i<zeros+ones;i++ )
				a[i]=1;
			
			for (int i=zeros+ones;i<a.length;i++)
				a[i]=2;
			
			for (int i=0;i<a.length;i++)
				System.out.println(a[i]);
	
	}
	


}
