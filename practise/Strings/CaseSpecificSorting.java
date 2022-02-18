package practise.Strings;

import java.util.ArrayList;
import java.util.Collections;



public class CaseSpecificSorting {

	public static void main(String[] args) {
		
		String s = "defRTSersUXI";
		
		String sLow = s.toLowerCase();
		
	   ArrayList<Character> lc = new ArrayList<>();
	   ArrayList<Character> uc = new ArrayList<>();

		int j=0,k=0;
		for (int i=0;i<s.length();i++) {
			if(Character.isLowerCase(s.charAt(i))) 
				lc.add(s.charAt(i));
			else
				uc.add(s.charAt(i));
			 
		}
		
		Collections.sort(lc);
		Collections.sort(uc);
		
		j=0;k=0;
		
		Character[] sortedArr = new Character[s.length()]; 
		for (int i=0;i<s.length();i++) {
			
			if (Character.isLowerCase(s.charAt(i)))
					sortedArr[i] = lc.get(j++);
			else
				    sortedArr[i] = uc.get(k++);
			
		}
		
		for (int i=0;i<s.length();i++)
			System.out.print(sortedArr[i]);

		
	}

}
