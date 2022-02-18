package practise.HashMap;

import java.util.HashMap;

//Given a string s and another string patt. 
//Find the character in patt that is present at the minimum index in S.
public class MinIndexedCharacter {

	public static void main(String[] args) {
		
		String s = "zsffsyle", patt = "bfherjz";
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		int i=0;
		while(i<s.length()) {
			if (!hm.containsKey(s.charAt(i)))
				hm.put(s.charAt(i), i);
			i++;
		}
			
		i=0;
		while(i<patt.length()) {
			if (hm.containsKey(patt.charAt(i))) {
				System.out.println(patt.charAt(i));
			    break;
			}
			i++;
		}

	}
	
	

}
