package practise.Recursion.basic;

//convert "XYZ(abc)ewfew" to "(abc)"

public class ParenBit {

	public static void main(String[] args) {
		 String s = "Xwd(abc)rge(fwe)r";
		 
			System.out.println(keepPar(s));

		}
     
	static int flag = 0;
	public static String keepPar(String s) {
		
		
 if (s.length() == 0 || s.length() == 1) {
			return "";
		}
		

    if (s.charAt(0) == '(') {
           flag=1; 	
		return s.charAt(0)+keepPar(s.substring(1));
    }
    else if (s.charAt(0) == ')') {
        flag=0;
    	return s.charAt(0)+keepPar(s.substring(1));
    } else if (s.charAt(0)!= '(' && flag == 1)
    	return s.charAt(0)+keepPar(s.substring(1));
    else
    	return keepPar(s.substring(1));
	} 
}
	
