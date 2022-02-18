package practise.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	public static void main(String[] args) {
		String s = "aab";
		List<List<String>> result = new ArrayList<List<String>>();
		dfs(0,result,new ArrayList<String>(), s);

	}
	
	public static void dfs (int start,List<List<String>> result,List<String> currentList, String s) {
		
		if (start > s.length())
			result.add(currentList);
		
//		for (int end=start;end<s.length();end++) {
//			if (isPalindrome(s.substring(start,end))) {
//				currentList.add(s.substring(start,end+1));
//				  
//		}
	}

}
