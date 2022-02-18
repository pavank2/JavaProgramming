package practise.Recursion;

public class StringPermutations {

	public static void main(String[] args) {

	String s = "ABCD";
    int n=s.length() - 1;
    
   	permute(s,0,n);

	}

	public static void permute(String str,int l,int r) {
		
		if (l == r)
			System.out.println(str);
		
		else {
			for (int i=l;i<=r;i++) {
				
				str=swap(str,l,i);
				permute(str,l+1,r);
				str=swap(str,l,r);
			}
		}
		
	}
	
	public static String swap(String s,int i,int j) {
		char[] c = s.toCharArray();
		char temp= c[i];
		c[i] = c[j];
		c[j]=temp;
		
		return String.valueOf(c);
	}
	

}
