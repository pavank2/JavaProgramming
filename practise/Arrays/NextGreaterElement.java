package practise.Arrays;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {

	Stack<Integer> s = new Stack<>();	
     int[] a = {4, 5, 2, 25};
     int item=0;
     
     s.push(a[0]);
     int element=0, next =0;
     for (int i=1;i<a.length;i++) {
    	 
    	 next = a[i];
    	 
    	 while (!s.empty()) {
    		 
    		 element = s.pop();
    		 
    		 while (element < next) {
    			 
    			 System.out.println(element+" "+next);   //Found next greater element
    			 
    			 if (s.empty())
    				 break;
    			element =  s.pop();                             // keep popping and printing next greater element
    			 
    		 }
    		 
    		 if (element > next)
    			 s.push(element);
    		 	 
    	 }
    	 
    	 s.push(next);	 
     }

     while (!s.empty()) {
    	 element = s.pop();
    	 
    	 System.out.println(element+" -1");
     }
	}

}
