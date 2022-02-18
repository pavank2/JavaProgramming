package StackAndQueue;

import java.util.Stack;

// Find nearest smaller element to the left for each element in array

public class LeftSmaller {

	public static void main(String[] args) {
		int[] a = {2, 4, 8, 7, 7, 9, 3};
		
		Stack<Integer> s = new Stack<>();
		
	
		
		int[] ls = new int[a.length];
		
		s.push(a[0]);
		for (int i=1;i<a.length;i++) {
		    
			
			while (!s.empty() && s.peek() >=a[i]) { //while condition is not met, keep popping
				
				s.pop();
				
				
			}
			if(!s.empty())
				ls[i]=s.peek();   //assign the next smaller element to the ls array
			else	
				ls[i] = 0;   //if no smaller element in left
				
			s.push(a[i]);
			}
			
			
		for (int i=0;i<ls.length;i++) {
			System.out.println(ls[i]);
		}
			
		}
		

	

}
