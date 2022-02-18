package StackAndQueue;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();

		s.push(20);
		s.push(10);
		s.push(25);
		s.push(5);
		s.push(15);
		
		reverseStack(s);
		
		System.out.println("Top of reversed stack: "+s.pop());
		
	}
	
	private static void reverseStack(Stack<Integer> s) {
		
		
		if (!s.empty()) {
			int item = s.pop();
			
			reverseStack(s);
			
			insertAtBottom(s,item);
			
		}
	}

	private static void insertAtBottom(Stack<Integer> s, int item) {
		
		if (s.empty())
			 s.push(item);
		
		else
		{
			int top = s.pop();
			insertAtBottom(s, item);
			s.push(top);
		}
		
	}

}
