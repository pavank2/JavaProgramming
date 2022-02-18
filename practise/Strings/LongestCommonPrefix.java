// Find the longest common prefix string amongst an array of strings.

package practise.Strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {

     String[] strs = {"flower","flow","flight"};
     String prefix="";
     
     int len=strs[0].length();
     int i=1;int j=0;
 
     
     while (j<len){
    	i=1;
    	char c = strs[0].charAt(j);
    
        while (i<strs.length) {
    	  if (strs[i].charAt(j)!=c){
    		 System.out.println("Prefix: "+prefix);
    		 return;
    	  }
    	  i++;
    	}
          prefix=prefix+c;
          
          j++;
	}

  }   
}
