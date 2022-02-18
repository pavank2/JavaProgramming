package practise.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

/*
Given a dictionary of words, find all strings that match the given pattern where every character
 in the pattern is uniquely mapped to a character in the dictionary. */

public class PatternMatcher {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("baab");
		al.add("gfvg");
		al.add("ssgg");
		
		String pattern="hrrh";
		matchPattern(al,pattern);
		
			
		}
		
public static void matchPattern(ArrayList<String> al,String pattern) {
	
	 String hash = encodeString(pattern);
	 
	 for (String s:al) {
		 
		 if (s.length() == pattern.length() && encodeString(s).equals(hash)) {
			 System.out.println(s);
		 }
	 }
	 
	}

 
  public static String encodeString(String str) {
	  
	  HashMap<Character,Integer> hm = new HashMap<>();
	  int j=0;
	  String res="";
	  for (int i=0;i<str.length();i++) {
		  char c = str.charAt(i);
		  
		  if (!hm.containsKey(c)) 
			  hm.put(c,j++);   //If key is not present, assign a unique number to key
 		  
		  res += hm.get(c);
		 
		  
	  }
	  System.out.println(str+" "+res);
	  return res;
  }

}
