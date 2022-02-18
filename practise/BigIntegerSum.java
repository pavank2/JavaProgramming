package practise;

public class BigIntegerSum {

	public static void main(String[] args) {
	
	String s1="234235235";
	String s2=  "4574658";
		
    int size = s1.length() < s2.length()? s1.length():s2.length();
    int i,j,s1Int,s2Int, reminder=0;
    String sum="";
    
    for (i=s1.length(),j=s2.length();size>0;i--,j--,size--){
    	//  s1char = Integer.parseInt(String.valueOf(s1.indexOf(i-1))); //This works too
            s1Int = Character.getNumericValue(s1.charAt(i-1));
            s2Int = Character.getNumericValue(s2.charAt(j-1));

            sum+= (s1Int+s2Int)%10+reminder;
            reminder=(s1Int+s2Int)/10;
    
    }
   
   
   String longerStr = s1.length() > s2.length()? s1:s2;  //To process remaining longer integer
   
   int k = i > j?i:j; //Taking bigger of i or j values from previous loop
   
    while (k>0) {
    s1Int = Character.getNumericValue(longerStr.charAt(k-1));
    sum+=s1Int+reminder;
    reminder=0;
    k--;
    }
    
    StringBuilder sb=new StringBuilder(sum); 
    sb.reverse();
    System.out.println("Sum of Big Integers:"+sb);
	}

}
