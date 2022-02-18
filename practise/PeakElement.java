package main.java;

public class PeakElement {

	public static void main(String[] args) {

     int[] a = {2, 3,6,20,29,30};
     
     if (a[0] >=a[1]) {
 		System.out.println(a[0]);
 		return;
     }

     for (int i=1;i<a.length-1;i++) {
    	 if (a[i] >= a[i-1] && a[i] >= a[i+1]) {
    		 System.out.println(a[i]);
    		 return;
    	 }
     }
     
     if (a[a.length-1] >=a[a.length-2]) {
  		System.out.println(a[a.length-1]);
  		return;
      }
	}
	
	
}
