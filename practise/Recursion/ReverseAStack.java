package practise.Recursion;

import java.util.Stack;

public class ReverseAStack {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		
        s.push(20);
        s.push(10);
        s.push(13);
        s.push(32);
        s.push(8);
        
        reverse(s);
        
        while (!s.empty()) {
        	 	System.out.println(s.peek());
        	 	s.pop();
        }
	}


	public static void reverse(Stack s) {
		
		if (s.empty())
			return;
		
		
		int temp=(int) s.pop();
		reverse(s);
		
		insert(s,temp);
	}
	
	public static void insert(Stack s,int temp) {
		
		if (s.empty()) {
			s.push(temp);
			
		}
		else {
		int temp2 = (int)s.peek();
		s.pop();
		insert(s,temp);
		
		s.push(temp2);
		}
		
}

}	