package practise.Strings;

public class StringsAreRotations {

	public static void main(String[] args) {
		String s1="ABACD";
		String s2="CDABA";
		
		int len=s1.length(); // Assuming both are same length
				
		

     String s3 = s1.concat(s1);
     
     if (s3.indexOf(s2)!=-1)
    	 System.out.println("Is rotation");
     else
    	 System.out.println("Is not rotation");

	}
	

}
