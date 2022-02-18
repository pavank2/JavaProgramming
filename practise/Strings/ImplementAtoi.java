package practise.Strings;

public class ImplementAtoi {

	public static void main(String[] args) {
		
		String s = "3478";
		
		char[] ch = s.toCharArray();
		
		int i=s.length();int digit=0;
		int number=0;
		while (i>0) {
			digit = ch[i-1] - '0';
			number+= digit*Math.pow(10,s.length()-i);
			i--;
		}
		
		System.out.println(number);
	}
	

}
