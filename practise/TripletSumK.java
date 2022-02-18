package practise;

import java.util.Arrays;

//Given an array arr of size n and an integer X. 
//Find if there's a triplet in the array which sums up to the given integer X.
public class TripletSumK {

	public static void main(String[] args) {

     int sum=10;
     int[] a= {1,3,4,7,24,16,6};
     
     Arrays.sort(a);
     
     for (int i=0;i<a.length-2;i++) {
    	 
    	 int l=i+1;
    	 int r=a.length-1;
    	 
    	 while (l <r) {
    		 if (a[i]+a[l]+a[r] == sum) {
    			 System.out.println(a[i]+""+a[l]+""+a[r]);
    			 break;
    		 }
    		 else if (a[i]+a[l]+a[r] < sum) 
    			 l++;
    		 else
    			 r--;
    	 }
     }
     
	}

}
