package practise.Recursion;

public class GenerateParantheses {

	public static void main(String[] args) {
	  int n = 3;
	  
	 char[] str = new char[2*n];
	 
	 generateParantheses(str,n);
	}
	
	public static void generateParantheses(char[] str,int n) {
		
		if (n>0)
			genPar(str,0,n,0,0);
		
		return;
	}
		
	public static void genPar(char[] str,int pos,int n,int open,int close) {
		
		if (close == n) {
			
			for (int i=0;i<str.length;i++) 
				System.out.print(str[i]);
			 System.out.println();
		
			return;
		}
			
		if (open < n) {
			str[pos]= '(';
			genPar(str,pos+1,n,open+1,close);
		}
		
		if (close < open) {
			str[pos] = ')';
			genPar(str,pos+1,n,open,close+1);
		}
	}
		

}
