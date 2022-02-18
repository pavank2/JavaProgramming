package practise;

import java.util.HashMap;
import java.util.Map.Entry;


public class Queue {


	
	
	int SIZE = 5;
	int front,rear;
	int[] queue = new int[SIZE];
	
	public Queue() {
		front=-1;
		rear=-1;
	}
	
	boolean isFull() {
		
		if(front ==0 && rear == SIZE-1)
		  return true;
		else
		  return false;
	}
	
     boolean isEmpty() {
		if (front == -1 )
			return true;
		else
			return false;
	}
     
     public void enQueue(int element) {
    	 
    	 if (isFull()) {
    		 System.out.println("Queue is full. No space to add element!");
    		 return;
    	 }
    	 
    	 if (isEmpty()) {
    		 front=0;
    		
    	 }
    	 
    	 rear++;
    	 queue[rear] = element;
    	 System.out.println("Element inserted:"+element);
     }
     
     public void deQueue() {
    	 
    
    	 if (isEmpty()) {
    		 System.out.println("Queue is empty.No element to delete!");
    		 return;
    		
    	 }
    	 
    	 int deleted = queue[front];
    	 if(front==rear) { //Only one element in queue
    		 rear = -1;
    		 front=-1;
    	 } else {
    	 front ++;
    	 }
    	 System.out.println("Element deleted:"+deleted);
    	 
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
     
     public void findFrequency() {
    	 
    	 HashMap<Integer,Integer> hm = new HashMap<>();
    	 
    	 for (int i=front;i<=rear;i++) {
    		 
    		 if(hm.containsKey(queue[i]))
    			 hm.put(queue[i],hm.get(queue[i])+1);
    		 else
    			 hm.put(queue[i], 1);
    	 }
    	 
    	 for (Entry<Integer, Integer> entry: hm.entrySet()) {
    		 int key = entry.getKey();
    		 int value = entry.getValue();
    		 
    		 System.out.println("Key:"+key+", value:"+value);
    	 }
     }
	public static void main(String[] args) {
		
		Queue q = new Queue();
		
		q.enQueue(20);
		q.enQueue(45);
		q.enQueue(20);
		q.enQueue(45);
		q.enQueue(100);
		q.enQueue(40);
		
		q.findFrequency();
		q.display();
		
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.display();
	}

}
