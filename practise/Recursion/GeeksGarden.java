package practise.Recursion;
//Geek has a rosarium and it has N*M slots, some of them are empty and some of them
//have roses. Given N*M character array consists of 0's and 1's. 0 represents an empty
//spot and 1 represents a rose. The task is to find the maximum number of adjacent roses 
//in geek's rosarium. 
public class GeeksGarden {

	public static void main(String[] args) {
		
		int[][] a = {{1,0,0,1},
				     {0,0,1,1},
				     {0,1,0,1}};
		
		int m=a.length;
		int n=a[0].length;
	
	System.out.println(adjacent(a,m-1,n-1));
	}
	
public static int adjacent(int[][] a,int i,int j){
        
	if (i==0 || j==0S)
	         return 1;
       
				
		if (a[i][j] == 1||a[i+1][j] == 1||a[i][j+1]==1)
				return (1+adjacent(a,i-1,j-1));
		else
			return adjacent(a,i-1,j-1);
			
				 
				
		}

	}


