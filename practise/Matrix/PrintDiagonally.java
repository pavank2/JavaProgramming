package practise.Matrix;

// NOT COMPLETED
//Print elements of a matrix anti-diagonally
public class PrintDiagonally {

	public static void main(String[] args) {
		int[][] m = {{1,2,3,4},
 		             {5,6,7,8},
 		            {9,10,11,12},
 		           {13,14,15,16}};

		int n= m.length;
		
		for (int count=0;count<n;count++) {
			
			for (int i=0;i<count;i++) {
				int temp=count-i;
				System.out.println(m[count][temp]);
			
			System.out.println();
			}
	}
	}

}