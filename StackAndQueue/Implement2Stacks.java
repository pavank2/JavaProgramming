package StackAndQueue;

 
public class Implement2Stacks {

public static final int SIZE=6;
public static final int SIZE1 = 4;
public static final int SIZE2 =  SIZE - SIZE1;
static int[] a = new int[SIZE];

static class Stack1{
		
	
		int top1;
		
		Stack1(){
			top1 = -1;
		}
		
	public void push(int item) {
			if (top1 == SIZE1-1) {
				System.out.println("Stack1 is full. Cannot insert");
				return;
			}
		
		a[++top1] = item;	
			
		}
		
	public int pop() {
		
		if (top1 == -1) {
			System.out.println("Stack1 is empty");
			return -1;
		}
		
		return(a[top1--]);
		
	}
	
	public void display() {
		
		if (top1 == -1 ) {
			System.out.println("Stack 1 empty");
			return;
		}
		
		for (int i=0;i<=top1;i++)
			System.out.print(a[i]+" ");
		return;
	}
	
}
/***************************************************/
static class Stack2{
	
	
	int top2;
	
	Stack2(){
		top2 = SIZE1-1;
	}
	
	public void push(int item) {
		if (top2 == SIZE-1 ) {
			System.out.println("Stack2 is full. Cannot insert");
			return;
		}
	
	a[++top2] = item;	
		
	}
	
public int pop() {
	
	if (top2 == SIZE1-1) {
		System.out.println("Stack2 is empty");
		return -1;
	}
	
	return(a[top2--]);
	
}

public void display() {
	
	if (top2 == SIZE1-1 ) {
		System.out.println("Stack 2 empty");
		return;
	}
	
	for (int i=SIZE1;i<=top2;i++)
		System.out.print(a[i]+" ");
	return;
}


}


		
	public static void main(String[] args) {

    Stack1 s1 = new Stack1();
    Stack2 s2 = new Stack2();
    
    s1.push(30);
    s1.push(40);
    
     s1.display();
   s2.push(20);
    s2.push(25);
   s2.push(35);

    s2.display();

	}

}
