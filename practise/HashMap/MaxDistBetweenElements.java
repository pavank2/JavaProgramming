package practise.HashMap;

import java.util.HashMap;

//Given an array with repeated elements, 
//the task is to find the maximum distance between two occurrences of an element.
public class MaxDistBetweenElements {

	public static void main(String[] args) {
	  int[]	a = {1, 13, 25, 25, 25, 13,1};
	  int maxDist=0;
	  HashMap<Integer,Integer> hm = new HashMap<>();
	  
	 for (int i=0;i<a.length;i++) {
		 if(!hm.containsKey(a[i]))
			 hm.put(a[i], i);
		 else {
			 
			  if (i - hm.get(a[i]) > maxDist)
				  maxDist = i - hm.get(a[i]);
		 }
			 
	 }
	  System.out.println(maxDist);
	  

	}

}
