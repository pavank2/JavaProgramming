package practise.Strings;

import java.util.HashMap;

public class RepeatedCharacterString {
	public static void main(String[] args) {
		
		String s = "ThisisTheRhythmOfLife";
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
	    int i=0;
	    char c;
	    while (i <s.length()) {
	    	c =s.charAt(i);
	    	if(hm.containsKey(c))
	    		hm.put(c, hm.get(c)+1);
	    	else
	    		hm.put(c,1);
	    	i++;
	    }
	    
	    for (i=0;i<s.length();i++) {
	    	c = s.charAt(i);
	    	
	    	if(hm.get(c) == 1) {
	    	 System.out.println("First non-repeated char"+c);
	    	 break;
	    	}
	    }
	}

}
