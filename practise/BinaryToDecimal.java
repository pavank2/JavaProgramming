package practise;

public class BinaryToDecimal {

	public static void main(String[] args) {

      String s = "1101";
      
      char[] c = s.toCharArray();
      int n = c.length;
      
      int decimal=0;
      for (int i=n-1;i>=0;i--) {
    	  decimal += Math.pow(2, n-i-1)*(c[i]-'0');
      }

       System.out.println(decimal);
	}

}
