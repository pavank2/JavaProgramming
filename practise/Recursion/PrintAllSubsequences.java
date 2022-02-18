package practise.Recursion;

import java.util.ArrayList;

public class PrintAllSubsequences {

	static ArrayList<String> al = new ArrayList<>();
	public static void main(String[] args) {

    String s = "random";
    
    printAllSub(s,"");
    System.out.println(al);

	}
	
	public static void printAllSub(String s,String dummy) {
		
		if (s.length() == 0) {
			al.add(dummy);
		    return;
	}
		
		printAllSub(s.substring(1),dummy+s.charAt(0));
		
		printAllSub(s.substring(1),dummy);	
	}

}
