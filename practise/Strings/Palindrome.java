package practise.Strings;

public class Palindrome {

	public static void main(String[] args) {
		String s = "A man,a plan, a canal: Panama";
		

        int z = s.length()-1;
        int i = 0;
   
        while (i < z) {
        
            if (!Character.isLetterOrDigit(s.charAt(z))) { z--; continue; }
            if (!Character.isLetterOrDigit(s.charAt(i))) { i++; continue; }   
            if (Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(z--))) { 
                System.out.println("Not palindrome");
                return ;
            } 
        }
        System.out.println("Palindrome");
               
	    }
}
