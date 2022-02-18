package practise.Strings;

import java.util.HashMap;
import java.util.Map.Entry;

// Input: str = "abcbedabcabc",  k = 3
// Output: 1
// Replace "bed" with "abc" so that the whole string becomes repetition of "abc".
public class RepetitionkLengthSubstring {

	public static void main(String[] args) {
		String s = "abcbedabcabcabc"; int k = 3;
       
		if ((s.length()%k) != 0){
				System.out.println("No sub possible");
		        return;
	}
		HashMap<String,Integer> hm = new HashMap<>();
		for (int i=0;i<=s.length()-k;i=i+k) {
			String temp = s.substring(i,i+k);
	
			if (!hm.containsKey(temp))
				hm.put(temp, 1);
			else
				hm.put(temp, hm.get(temp)+1);
			
		}
		
		int noOfsubsofK = s.length()/3;
		String subFreq="";
		String subToRepl="";
		
		for (Entry<String,Integer> e: hm.entrySet()) {
		  if (e.getValue() == noOfsubsofK-1)
			  subFreq = e.getKey();
		  else if (e.getValue() == 1)
			  subToRepl = e.getKey();		  
		}
		
		System.out.println(subFreq+" "+subToRepl);
	}

}
