package practise.Arrays;

public class ValidMountainArray {

	public static void main(String[] args) {

     int[] a= {0,2,3,4,5,2,1,0};
     
     int peak=0;
     
     for (int i=0;i<a.length-1;i++) {
    	 
    	
    		 
    	 if (peak == 0 && a[i] >= a[i+1]) {
    		 
    		 peak=1;
    	 }
    	 else if (peak == 1 && a[i] <= a[i+1]) {
    		 System.out.println("Not a mountain array");
    		 return;
    	 }
     }
      System.out.println("Mountain array");
	}

}
