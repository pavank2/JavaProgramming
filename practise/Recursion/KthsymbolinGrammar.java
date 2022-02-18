package practise.Recursion;

public class KthsymbolinGrammar {

	public static void main(String[] args) {
		
		int n = 5,k=2;
		
	//	System.out.println(kthSymbol(n,k));
		kthSymbol(n,k);
	}
	
	public static void kthSymbol(int n,int k) {
		
		int num = 0;
		String s = String.valueOf(num);  //con
		String[] strArr = new String[n];
		strArr[0] = s;
		for (int i=0;i<n-1;i++) {
			{
			  int len = strArr[i].length();
			  int l=0,j=0;
			  StringBuilder sb = new StringBuilder();
//for each string[i] in string array, generate string[i+1] by iterating each char		  
			  while (j<len) {
				  
			    
				  if (strArr[i].charAt(j) == '0') {
					sb.append('0');
					sb.append('1');
				  } else {
					    sb.append('1');
						sb.append('0');
				  }
				  
				  j++;
			  }
			  strArr[i+1]= sb.toString();
			  System.out.println(strArr[i+1]);
			  
			  if (i == n-2) // If last string is reached, get kth char,indexed-1
				  System.out.println(strArr[i+1].charAt(k-1));
			
		}
			
	}
	}
}
