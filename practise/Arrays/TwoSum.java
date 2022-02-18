package practise.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int nums[] = {2,11,15,7,6};
		int target = 9;
       
		twoSum(nums,target);
		
	}
	
	public static void twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            System.out.println(i+","+ map.get(complement));
	           return;
	        }
	        throw new IllegalArgumentException("No two sum solution");
	    }
	 
	}

}

