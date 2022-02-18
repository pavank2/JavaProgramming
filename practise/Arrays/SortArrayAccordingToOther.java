 package practise.Arrays;

import java.util.HashMap;
import java.util.Map.Entry;

//Given two integer arrays A1[ ] and A2[ ] of size N and M respectively. 
//Sort the first array A1[ ] such that all the relative positions of the elements
//in the first array are the same as the elements in the second array A2[ ]
public class SortArrayAccordingToOther {

	public static void main(String[] args) {
		int a[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
		int b[] = {2, 1, 8, 3};

		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for (int i=0;i<a.length;i++)
			if (!hm.containsKey(a[i]))
				 hm.put(a[i], 1);
			else
				hm.put(a[i], hm.get(a[i])+1);
		int j=0;
		for (int i=0;i<b.length;i++) {
			if (hm.containsKey(b[i])) {
				int count = hm.get(b[i]);
				
				while(count>0) {
					a[j++]=b[i];
					count--;
				}
				hm.put(b[i],0);  
			}
		}
		
		for(Entry<Integer, Integer> e: hm.entrySet()) {
			if(e.getValue() != 0)
				a[j++] = e.getKey();
		}
		
		for (int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
