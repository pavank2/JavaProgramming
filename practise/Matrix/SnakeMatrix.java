package practise.Matrix;

public class SnakeMatrix {

	public static void main(String[] args) {

		int matrix[][] = {{45, 48, 54},
	             {21, 89, 87},
	             {70, 78, 15}};
		
		int m= matrix.length;
		int n = matrix[0].length;
		int j=0;
		for (int i=0;i<m;i++) {
			if (i/2 == 0) {
				j=0;
				while (j<n) {
					System.out.println(matrix[i][j]);
					j++;
					
				}
			} else {
				j = n-1;
				while (j>=0) {
					System.out.println(matrix[i][j]);
					j--;
					
				}
				
			}
		}
	}

}
