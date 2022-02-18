package practise;

import java.util.Stack;



//For an array of numbers, find the nearest number to the right 
//which is greater than current element in array
public class NearestGreaterToRight {

	public static void main(String[] args) {
		
		int[] a = {1,3,0,0,4,8,2};
		
		Stack<Integer> s = new Stack<Integer>();
		//ArrayList
		
		for (int i=a.length-1;i>0;i++) {
    //        Brute force approach
			for (int j=i;j<a.length;j++) 
				if (a[j]>a[i]) {
					System.out.println(a[j]);
					break;
				}
           
			
//			if (s.empty()==true)
//				s.add(-1);
//			else if (s.empty()!=true && s.peek() > a[i])
//			 s.add(s.peek());
//			else if (s.empty()!=true && s.peek() < a[i]) {
//				
//			
//				while (s.size() >0 || s.peek() <= a[i])
//					s.pop();
//				
//				if (s.size() == 0)
//					s.add(-1);
			  
			}
		}
			
		}

	


