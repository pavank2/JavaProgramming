package practise.Matrix;

public class RotateMatrix {

	public static void main(String[] args) {

      int[][] m = {{1,2,3,4,},
    		       {5,6,7,8},
    		       {9,10,11,12},
    		       {13,14,15,16}};
      
      transpose(m);
      reverseColumns(m);
      print(m);

	}

	public static void transpose(int[][] m) {
		int rows = m.length;
		int cols = m[0].length;
		int temp=0;
		for (int i=0;i<rows;i++)
			for (int j=0;j<cols;j++) {
				temp = m[i][j];
				m[i][j]=m[j][i];
				m[j][i]=temp;
			}
				
	}
	
	public static void reverseColumns(int[][] m) {
		int rows = m.length;
		int cols = m[0].length;
		int temp=0;
		for (int i = 0; i < cols; i++)
            for (int j = 0, k = cols - 1;
                 j < k; j++, k--) {
                temp = m[j][i];
                m[j][i] = m[k][i];
                m[k][i] = temp;
            }			
		}
		
	public static void print(int[][] m) {
		
		int rows = m.length;
		int cols = m[0].length;
		
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) 
				System.out.print(m[i][j]);
				
		    System.out.println("");
		}
		
	}
	
}
