package practise.Arrays;

public class SubArraysWithEqualZeroOne {

	public static void main(String[] args) {
		int[] a= {1,0,0,1,0,1,1};
		
		
		for (int i=0;i<a.length;i++) {
			for (int j=i; j<a.length;j++) {
				checkEqual(a,i,j);
			}
		}
	}	
public static void checkEqual(int[] a, int i,int j) {
	int zero=0,one=0;
	for (int index=i;index<=j;index++) {
		
		if (a[index] == 0)
			zero++;
		else
			one++;
			
	}
 if(zero == one)
	 System.out.println("("+i+","+j+")");
		
	}
 
 
	
	
}
