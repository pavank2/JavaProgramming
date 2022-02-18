package practise.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[]  arr = {7,1,5,6,9,4};
		int k=2;
		rotate(arr,k);	
	}

	public static void rotate(int[] arr,int k) {
//		int size=arr.length;
//		
//		int[] finalArr= new int[size];
//		
//		int startIndex=size-k;
//		int i=startIndex,j=0;
//		while(i<size) {
//			finalArr[j++]=arr[i++];
//		}
//		
//		i=0;
//		
//		while(i<startIndex) {
//			finalArr[j++]=arr[i++];
//		}
//		
//		for (i=0;i<arr.length;i++)
//		System.out.println(finalArr[i]);
		
		int len = arr.length;
		 int clockrotate = len - k;
	      
	      int b[] = new int[len];
	      
	      for (int i=0;i<len;i++)
	         b[i]=arr[(i+clockrotate)%len];
	         
	        for (int i=0;i<len;i++)
	            System.out.print(b[i]+" ");
	}
}
