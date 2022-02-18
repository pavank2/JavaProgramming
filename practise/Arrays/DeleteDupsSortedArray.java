package practise.Arrays;

//Delete duplicate elements in a sorted array
public class DeleteDupsSortedArray {

	public static void main(String[] args) {
	
		int[] arr = {2,4,4,4,7,9,10,11,12};
		
		int flag=0,j=0,dup=0;
		
		for (int i=0;i<arr.length-1;i++)
			if (arr[i] == arr[i+1]) {
				dup++;
			}
//		System.out.println(dup);
		for (int i=0; i<arr.length-1;i++) {
			if (arr[i]!=arr[i+1]) {
				flag=0;
				arr[j]=arr[i];
				j++;
			} 
						
		}
		
		int i = arr.length-1;
		arr[j]=arr[i];
		
//	int i = arr.length-1;
//	if (arr[i]!= arr[i-1])
// 			arr[j]=arr[i];

		for (i=0;i<arr.length-dup;i++) {
			System.out.println(arr[i]);
		}
	 }

}
