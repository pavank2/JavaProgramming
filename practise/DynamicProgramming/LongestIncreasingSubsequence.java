package practise.DynamicProgramming;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		 int[] a = {34,3,5,12,7,45,26,18,38,32};
		
		 int[] lis = new int[a.length];
		 
		 for (int i=0;i<a.length;i++)
			 lis[i]=1;
   
		 for (int i=1;i<a.length;i++)
			 for (int j=0;j<i;j++)
				 if (a[i]> a[j])
					 if (lis[i]<lis[j]+1)
						 lis[i]=lis[j]+1;
		 
		 System.out.println(lis[a.length-1]);

	}

}
