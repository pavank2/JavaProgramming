package practise.Recursion;

public class UniquePaths {

	public static void main(String[] args) {
		
		int m=3,n=4;
		
		System.out.println(numberOfPaths(3,4));
		

	}
	
	public static int numberOfPaths(int m, int n)
	  {

       if(m==1 || n == 1)
    	   return 1;
       
       return numberOfPaths(m,n-1)+numberOfPaths(m-1,n);
	  }

}
