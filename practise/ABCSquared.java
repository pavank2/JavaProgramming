package practise;

import java.util.ArrayList;
import java.util.List;

public class ABCSquared {

//Given an integer array, find all (a,b,c) such that a^2 + b^2 = c^2
	
	public static void main(String[] args) {

     int[] a = {2,3,6,1,8,5,10};
     
    List<Integer> al = new ArrayList<Integer>();
     
     for (int i=0;i<a.length;i++)
          al.add(a[i]);

     for (int i=0;i<a.length;i++)
    	 for (int j=i;j<a.length;j++) {
    		 if (al.indexOf(a[i]*a[i]+a[j]*a[j])!=-1 && i!=j)
    				 System.out.println(a[i]+" "+a[j]+" "+(a[i]*a[i]+a[j]*a[j]) );
    	 }
     
	}

}
