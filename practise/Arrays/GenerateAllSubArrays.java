package practise.Arrays;

public class GenerateAllSubArrays {

	public static void main(String[] args) {

    int[] a = {4,1,7,9};
    
    int n = a.length;
    
    for (int i=0;i<n;i++) {
    	for (int j=i;j<n;j++) {
    		System.out.print("[");
    		for (int k=i;k<j;k++) {
    		System.out.print(a[k]);
    		System.out.print(",");
    		}
    		System.out.print(a[j]);
    		System.out.print("]");
    	}
    	
    	System.out.println();
    }

	}

}
