package testPackage;

import java.util.HashMap;

public class FirstRepeatingChar {

	public static void main(String[] args) {
		
		String s = "A quick brown fox jumped over. There aAre many foxes! But this is an unique one##";
		
		if (s == "" || s == null)
			System.out.println("Null string");
		HashMap<Character,Integer> hm = new HashMap<>();
		
		//Generate hashmap
		for (int i=0; i< s.length();i++) {
			char c = s.charAt(i);
			if (!hm.containsKey(c))
				hm.put(c, 1);
			else
				hm.put(c,hm.get(c)+1);
				
		}
		
		//Iterate thru the array to get first non-Repeating
		
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if (hm.get(c) == 1) {
				System.out.println("First non-repeating char: "+c);
				break;
			}
			if (i==s.length()-1)
				System.out.println("None");
				
		}
		
	}

}
