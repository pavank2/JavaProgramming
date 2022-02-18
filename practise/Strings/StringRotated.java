package practise.Strings;

public class StringRotated {

	public static void main(String[] args) {
		String a = "amazon";
		String b = "azonam";
		
		//String c = onamaz

		int len = a.length();
		String clock = b.substring(len-2,len)+b.substring(0,len-2);
		
		String anti = b.substring(2,len)+b.substring(2);
		
		if (a.equals(clock) || a.equals(anti))
			System.out.println("String rotated");
	}

}
