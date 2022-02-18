package practise;

public class LongestOnesInBinary {

	public static void main(String[] args) {
	
		int decimal = 7;
		int[] binary = new int[10];
		int i=0,longestOnes=0,ones=0;
		
		//Convert decimal to binary
		
		while (decimal > 0) {
			binary[i] = decimal%2;
			decimal/=2;
			
			if(binary[i] == 1) 
				++ones;
			else 
				ones=0;
			
			longestOnes=longestOnes>ones?longestOnes:ones;
		     i++;
		}
		
		for (i=0;i<binary.length; i++)
		    System.out.print("Binary:"+binary[i]);
		System.out.println("Longest list of ones:"+longestOnes);

	}

}
