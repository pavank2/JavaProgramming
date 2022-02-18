package practise.Matrix;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		int a[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };

         int m = a.length;
         int n = a[0].length;
         
         int k=0; //starting row length
         int l=0; //starting column length
         
       while (k < m && l < n){  
    	   for (int i=0;i<n;i++) {
        	 System.out.println(a[k][i]);
    	   }
    	   k++;
    	   
    	   for (int i=k;i<m;i++) 
    		   System.out.println(a[i][n-1]);
           n--;
           
           if (k < m) {
        	   for (int i=n-1;i>=0;i--) {
        		   System.out.println(a[m-1][i]);
        	   }
        	   m--;
         }
           
           if (l<n) {
        	   for (int i=m-1;i>=0;i--){
        		   System.out.println(a[i][l]);
        	   }
        	   n--;
       }	 
	}
	}
}
