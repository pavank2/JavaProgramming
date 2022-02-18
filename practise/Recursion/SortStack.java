package practise.Recursion;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
	Stack<Integer> s = new Stack<Integer>();
		
	
	
    s.push(20);
    s.push(10);
    s.push(13);
    s.push(32);
    s.push(8);
    
    sort(s);
    
    while (!s.empty()) {
    	 	System.out.println(s.peek());
    	 	s.pop();
    }
}


public static void sort(Stack s) {
	
	if (s.empty())
		return;
	
	
	int temp=(int) s.pop();
	sort(s);
	
	insert_at_bottom(s,temp);
}

public static void insert_at_bottom(Stack s,int temp) {
	
	if (s.empty() || (int) s.peek() < temp) {
		s.push(temp);
		
	}
	else {
	int temp2 = (int)s.peek();
	s.pop();
	insert_at_bottom(s,temp);
	
	s.push(temp2);
	}

	}

}
