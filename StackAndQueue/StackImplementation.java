package StackAndQueue;

public class StackImplementation {

	int SIZE = 20;
	int top;
	int[] st = new int[SIZE];
	
	
	StackImplementation() {
		top=-1;
	}
	
	public void push(int data) {
		if (top == SIZE-1) {
			System.out.println("Stack is full");
			return;
		}
		st[++top]=data;
	}
	
	public int pop () {
		if (top == -1) {
			System.out.println("Stack is empty");
			top=-1;
			return top;
		}
		
		return st[top--];
	}
	
}
