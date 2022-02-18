package practise.Arrays;
//Given an unsorted array Arr of size N of positive integers. 
//One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.
public class FindMissingAndRepeating {

	public static void main(String[] args) {

   int[] a = {2,3,5,5,4};
		
      int[] count = new int[a.length+1];
      
      for (int i=0;i<a.length;i++)
    	  count[a[i]]++;
	

	for (int i=1;i<=a.length;i++) {

      if (count[i] == 0)
    	  System.out.println("Missing from array :"+i);
      else if (count[i] == 2)
    	  System.out.println("Duplicate: "+i);
    	  
	}
}

}