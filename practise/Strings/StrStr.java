package practise.Strings;

public class StrStr {

	public static void main(String[] args) {
		String s1="gfoeeksfogeeforks";
		String s2= "for";
		
		int m = s1.length();
		int n = s2.length();
		
		int i=0,j=0;
		
		for (i=0;i<m-n;i++) {
			
			for (j=0;j<n;j++) {
				if (s1.charAt(i+j)!= s2.charAt(j)) {
					break;
				}
			
			}
			
			if (j == n) {
				System.out.println("Found");
				return;
			}
		}
		
		System.out.println("Not Found");
		return;
        
	}

}
