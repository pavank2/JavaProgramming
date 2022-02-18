package practise.DynamicProgramming;

public class HouseRobber {

	public static void main(String[] args) {
	
		int[] a = {2,7,100,3,1,6,1};
		
		System.out.println(maxAmount(a));

	}
	
	public static int maxAmount(int[] a) {
	
	int maxAmt[] = new int[a.length+1];
     
	 maxAmt[0] = 0;
     maxAmt[1] = a[0];
     
     maxAmt[2] = Math.max(a[0], a[1]);
     

    for (int i=2;i<a.length;i++) {
    	maxAmt[i+1] = Math.max(maxAmt[i], maxAmt[i-1]+a[i]);
    	System.out.println(maxAmt[i+1]);
    }
    
    return maxAmt[a.length];
		
	}

}
