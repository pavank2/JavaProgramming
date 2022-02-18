package practise.Recursion;

/*Given an array of integers cost[] of length N, where cost[i] is the cost of
 the ith step on a staircase. Once the cost is paid, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.*/

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		int a[] = {25, 100, 20, 1, 30, 100, 20, 10, 30, 15};
		
		System.out.println(minCostClimbingStairs(a));

	}

	public static int minCostClimbingStairs(int[] a) {
		int[] cost = new int[a.length];
		
		cost[0] = 0;
		
		cost[1] = a[1];
		
		cost[2] = Math.min(a[0],a[1]);
		
		for (int i=2;i<a.length-1;i++) {
		  cost[i+1] = a[i]+Math.min(cost[i], cost[i-1]);
		  
		}
		return Math.min(cost[a.length-1],cost[a.length-2]);
	}
}
