package practise.Arrays;

//Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively 
// i.e first element should be max value, second should be min value, third should be second max, fourth
//should be second min and so on.

public class RearrangeArray {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6};  
	
//	This code only works for consecutive integers
	int n = arr.length;
	 int max_ele = arr[n - 1];
     int min_ele = arr[0];
     // traverse array elements
     for (int i = 0; i < n; i++) {
         // at even index : we have to put maximum element
         if (i % 2 == 0) {
             arr[i] = max_ele;
             max_ele -= 1;
         }

         // at odd index : we have to put minimum element
         else {
             arr[i] = min_ele;
             min_ele += 1;
         }
     }
	for (int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
}
}
