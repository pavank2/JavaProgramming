package practise;

public class LongestCommonSubsequence {

	static String largest = "";
	public static void main(String[] args) {

		String str1 = "ABCDGH";
		String str2 = "AEDFHR";
		
		
    largest = largestSubsequence(str1, str2);
	}
	
	
	public static String largestSubsequence(String str1,String str2) {
		
		
 		int index=0,i;
		
	    
	
		for (i=0;i<str1.length();i++) { 
			index =str2.indexOf(str1.charAt(i));
			
			if(index == -1)
				continue;
			
			if (index==(str1.length()<str2.length()?str1.length()-1:str2.length()-1))// to traverse least length
                 return largest;
			if (index >=0){
				largest+= str1.charAt(i);
				System.out.println(largest);
				largestSubsequence(str1.substring(i+1), str2.substring(index+1));
			
				
			}
			
			
		}
		
	return largest;
	}

}
