package practise.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

//Given an array of strings strs, group the anagrams together. 
public class GroupAnagrams {

	public static void main(String[] args) {
	
		String[] strList = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> total = new ArrayList<>();
		
		HashMap<String,ArrayList> hm = new HashMap<>();
		
		
		for (String s:strList) {
			char[] tempchar = s.toCharArray();
			Arrays.sort(tempchar);
			
			
			String tempStr = String.valueOf(tempchar);
			
			
			if (!hm.containsKey(tempStr)) {
				List<String> words = new ArrayList<>();
				words.add(s);
				hm.put(tempStr, (ArrayList) words);			
			}
			else {
				hm.get(tempStr).add(s);  // Put original string in hashmap	
				
			}
			
		}
		
		total.addAll((Collection<? extends List<String>>) hm.values());
		
      System.out.println(total);		
		

	}

}
