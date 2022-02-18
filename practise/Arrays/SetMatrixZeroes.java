package practise.Arrays;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		int[][] m = {{1,1,1},{1,0,1},{1,1,1}};
		int rows=m.length,cols=m[0].length;
		
		int[] rowarr = new int[rows];
		int[] colarr = new int[cols];
		
		for (int i=0;i<rows;i++)
			rowarr[i] = 1;
		
		for (int i=0;i<cols;i++)
			colarr[i] = 1;

		
	}

}
