package practise;

public class Palindrome {

	public static void main(String[] args) {
		String str ="A brave new world";
		String revStr = "";
		
		int length = str.length();
		int i=length-1;
		
		while (i>=0) {
			revStr += str.charAt(i);
			i--;
		}
		
		System.out.println(revStr);
	}
}
