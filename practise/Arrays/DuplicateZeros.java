package practise.Arrays;

public class DuplicateZeros {

	public static void main(String[] args) {
		
		int[] arr = {1,0,2,3,0,4,5,0};
		
		
		int[] newarr = new int[arr.length];
		int j=0;
		for (int i=0;i<arr.length;i++) {
			newarr[j++]=arr[i];
			
			if (arr[i]==0)
				newarr[j++]=0;
				
		}
			for (int i=0;i<arr.length;i++)
				System.out.println(newarr[i]);
			
	
	
	}

}
