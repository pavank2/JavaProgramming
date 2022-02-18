
//Given two sorted arrays A and B of size M and N respectively. 
// Each array contains only distinct elements but may have some elements
//in common with the other array. Find the maximum sum of a path from 
//the beginning of any array to the end of any of the two arrays.
//We can switch from one array to another array only at the common elements.
package practise;

public class MaxSumPath {

	 
	public static void main(String[] args) {
		 int a[] = {2,3,9,10,12,14,24,100};
		  int b[] = {1,4,6,9,13,14,16,18,20,22};

	 int maxSum = 0,sumA=0,sumB=0;
	 
	 int i=0,j=0,indexA=0,indexB=0;
	//Compare until the last common element in both arrays 
	 for (i=0;i<a.length;i++)
		 for (j=0;j<b.length;j++) {
			 if (a[i]==b[j]) {
				 
				sumA = partialSum(a,indexA,i);
				sumB = partialSum(b,indexB,j);
				 
				 maxSum+= (sumA>sumB)?sumA:sumB;
				 indexA=i+1;
				 indexB=j+1;
			 } 
		 }	 
	
	 //Rest of the array after all common elements are traversed
	 sumA = partialSum(a,indexA,a.length-1);
	 sumB = partialSum(b,indexB,b.length-1);
	 maxSum+= (sumA>sumB)?sumA:sumB;
	 
	 System.out.println(maxSum);
	}
	
	public static int partialSum(int[] array,int startIndex,int endIndex) {
		
		int partSum=0;
	for (int i=startIndex;i<=endIndex;i++) {
		partSum+=array[i];
	}
	return partSum;
	}

}
