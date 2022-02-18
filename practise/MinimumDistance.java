// Find minimum index based distance between two elements of the array, x and y.
package practise;
import java.lang.Math;

public class MinimumDistance {

	public static void main(String[] args) {
		
		int[] arr = {8,3, 5,6, 9,2,1,8,3,5,2,3};
		
		int x=3,y=2,posX=-1,posY=-1,minDist=arr.length;
		
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i] == x)
				posX=i;
			
			if(arr[i] == y)
				posY=i;
			
			if ((Math.abs(posX-posY) < minDist) && posX!=1 && posY!=-1)
				minDist = Math.abs(posX - posY);
	
			
		}
		
		if (minDist == arr.length) 
			System.out.println("Either x or y or both not in array");
		else 
		    System.out.println("Minimum distance between "+x+" and "+y+" is "+minDist);

	}

}
