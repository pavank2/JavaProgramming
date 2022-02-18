package practise;

import java.util.HashMap;
import java.util.Map.Entry;

import practise.Trees.BinaryTree;
import practise.Trees.Node;

public class QueueWithNode {


		int SIZE = 20;
		int front,rear;
		Node[] queue = new Node[SIZE];
		
		public QueueWithNode() {
			front=rear=-1;

		}
		
		boolean isFull() {
			
			if(front == 0 && rear == SIZE-1)
			  return true;
			else
			  return false;
		}
		
	     public boolean isEmpty() {
			if (front == -1 )
				return true;
			else
				return false;
		}
	     
	     public void enQueue(Node node) {
	    	 
	    	 if (isFull()) {
	    		 System.out.println("Queue is full. No space to add element!");
	    		 return;
	    	 }
	    	 
	    	 if (isEmpty()) {
	    		 front=0;
	    		
	    	 }
	    	 
	    	 rear++;
	    	 
	    	 queue[rear] = node;
	    	 System.out.println("Element inserted:"+node.data);
	     }
	     
	     public Node deQueue() {
	    	 
	    
	    	 if (isEmpty()) {
	    		 System.out.println("Queue is empty.No element to delete!");
	    		 return null;
	    		
	    	 }
	    	 
	    	 Node deleted = queue[front];
	    	 if(front==rear) { //Only one element in queue
	    		 rear = -1;
	    		 front=-1;
	    	 } else {
	    	 front ++;
	    	 }
	    	 System.out.println("Element deleted:"+deleted.data);
	    	 return deleted;
	    	 
	     }
	     
	     public void display() {
	    	 if (isEmpty()) {
	    		 System.out.println("Queue is empty");
	    		 return;
	    		
	    	 } else {
	    		 System.out.println("Elements in Queue");
	    		 for (int i=front;i<=rear;i++)
	    			
	    			 System.out.println(queue[i]);
	    	 }
	     }
	     
	   
		public static void main(String[] args) {
			
			Queue q = new Queue();
			
//			q.enQueue(20);
//			q.enQueue(45);
//			q.enQueue(20);
//			q.enQueue(45);
//			q.enQueue(100);
//			q.enQueue(40);
//			
//			q.findFrequency();
//			q.display();
//			
//			q.deQueue();
//			q.deQueue();
//			q.deQueue();
//			q.deQueue();
//			q.display();
		}

}



