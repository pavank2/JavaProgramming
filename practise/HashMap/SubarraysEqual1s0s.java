package practise.HashMap;
import java.util.*;

public class SubarraysEqual1s0s {

	public static void main(String[] args) {
		 //Given an array containing 0s and 1s. 
		//Find the number of subarrays having equal number of 0s and 1s.
		
		int a[] = {1,0,0,1,0,1,1};
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for (int i=0;i<a.length;i++) {
			int zerocount=0;
			int onecount=0;
			if (a[i] == 0) {
				zerocount++;
				hm.put(0,zerocount);
			} else {
				onecount++;
				hm.put(1,onecount);
			}
				
		}

	}

}
