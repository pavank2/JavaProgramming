package practise.Arrays;

public class LargestContiguousSubarray {

	public static void main(String[] args) {
		int[] a = {-4,-3,2,6,-8,4,8,-1,10};
		
		int maxsumsofar=a[0];
		int maxsumendinghere=0;
		
		for (int i=0;i<a.length;i++) {
			maxsumendinghere = maxsumendinghere + a[i];
			
			if (maxsumendinghere < 0)
				maxsumendinghere = 0;
			
			if (maxsumendinghere > maxsumsofar)
				maxsumsofar=maxsumendinghere;
			
			
		}

		System.out.println(maxsumsofar);
		
	}

}
