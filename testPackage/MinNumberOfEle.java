package testPackage;

import java.util.HashMap;

public class MinNumberOfEle {

	public static void main(String[] args) {

     int[] a = {30, 30, 25, 25, 11, 30, 25};  //o/p is 4
     
     
     HashMap<Integer,Integer> hm = new HashMap<>();
     
     for (int i=0;i<a.length;i++) {
    	 
    	 if (!hm.containsKey(a[i]))
    		 hm.put(a[i], 1);
    	 else
    		 hm.put(a[i], hm.get(a[i]+1));
     }
     
     
    

	}

}
