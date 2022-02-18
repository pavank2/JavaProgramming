package practise.Recursion;

//INCOMPLETE

//Given a binary string S and an integer K, 
//the task is to count the number of substrings that contain exactly K ones.
public class StringsWithKOnes {

	public static void main(String[] args) {
		
		String s = "10001110011010100";
		int k=3;
		
		System.out.println(noOfKOnes(s,k));
	}
	
	public static int noOfKOnes(String s,int k) {
	
		int start=0,end=0,currCounter=0,noOfOneSubs=0;
		
		while (currCounter!=k) {
			
		 if (s.charAt(end)==1)
			 currCounter++;
		 else
			 end++;	 
		}
			noOfOneSubs++;
		
			
			while (s.length() - start >= k && end <=s.length()-1) {
				//currCounter=0;
				start ++;
				if(s.charAt(start)==0) {
					noOfOneSubs++;	
					
				} else {  //char at start == 1
					end++;
					if (s.charAt(end) == 1)
						noOfOneSubs++;
				}
				
				
				
				
				
			}
	
	}

}
