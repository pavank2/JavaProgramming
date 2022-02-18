package practise.Strings;

public class ValidateIPAddress {

	public static void main(String[] args) {
		String s = "253.6.25.46";
		
		String[] str = s.split("\\.");
		int num=0;
		
	
		for (int i=0;i<str.length;i++) {
		if(str[i].charAt(0) == '0') {
			System.out.println("Not an IP address");
			return;
		}
			
		  num = Integer.valueOf(str[i]);
		
			
			if (num > 255) {
				System.out.println("Not an IP address");
				return;
			}
			
		}
		
		System.out.println("IP address");

	}

}
