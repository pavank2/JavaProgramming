//List the elements in the array which are duplicates
package practise.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class DuplicateNumbersinArray {

	public static void main(String[] args) {

		int n = 5;
		int[] a = {2,3,1,2,3,100,100,200};
		int i=0;
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		while (i<a.length) {
			
			if (hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i])+1);
			} else
				hm.put(a[i], 1);
			
			i++;
		
		}
			
		for (Entry<Integer, Integer> entry: hm.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			
			if (value > 1)
				System.out.println(key);
		}

	}

}
