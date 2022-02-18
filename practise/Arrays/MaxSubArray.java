package practise.Arrays;

import java.util.ArrayList;

public class MaxSubArray {

	public static void main(String[] args) {
		
		int[] a = {2,-8,1, 2, 5, -7, 2, 3};
		
		System.out.println(findSubarray(a));
		
	}
		
	public 	static ArrayList<Integer> findSubarray(int a[]) {
	        
	        int max_so_far=0, max_right_here = 0;
	        int start = 0, end = 0, s=0;
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        for(int i=0; i<a.length; i++){
	            if (a[i] >= 0)
	                break;
	            if (i==a.length-1){
	               list.add(-1);
	               return list;
	            }
	        }
	        
	        
	        for(int i=0; i<a.length; i++){
	 
	            if(max_right_here < 0 ){
	               max_right_here = 0;
	                s = i+1;
	                
	            }else{
	                max_right_here += a[i];
	            }
	 
	            if(max_right_here >= max_so_far){
	                max_so_far = max_right_here;
	 
	                start = s;
	                end = i;
	            }
	        }
			int j=0;
		//	System.out.println("****"+start+" "+end);
			
			for (int i=start;i<=end;i++){
			  list.add(a[i]);
			//  System.out.println(list.get(j++));
			}
			return list;
	    }
	

}
