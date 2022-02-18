package StackAndQueue;

public class NextGreatestInArray {

	static class Stack{
	    
	    int top;
	    int[] items = new int[100];
	    
	    void push(int x){
	      if (top == 99){
	        System.out.println("Stack full");
	        return;
	      } else {
	        items[++top] = x;
	      }
	        
	    }
	    
	    int pop(){
	      if (top == -1){
	        System.out.println("Stack empty");
	        return -1;

	      } else {
	        return items[top--];
	      }
	    } 
	    
	    boolean isEmpty(){
	      
	      if (top == -1)
	        return true;
	      else
	        return false;
	    }
	    
	  }
	  
	  static void nextgreatest(int[] a,int n){
	    
	     Stack s = new Stack();
	     int top = -1;
	     int element,next;
	    
	    s.push(a[0]);
	    
	    for (int i=1;i<n;i++){
	      
	      next = a[i];
	      
	      if (s.isEmpty() != true){
	        
	         element=s.pop();
	        
	        while (element < next){
	          System.out.println("Next greatest to "+element+" is "+next);
	          
	          if (s.isEmpty() == true)
	            break;
	          
	          element = s.pop();
	          
	        }
	        
	        if (element > next)
	             s.push(element);       
	        
	      }  
	      
	      s.push(next);
	      
	      
	  }

	    while (s.isEmpty() != true){
	       element = s.pop();
	      next=-1;
	      System.out.println("Next greatest to "+element+" is "+next);    
	    }
	}   
	  public static void main(String[] args) {
	    
	    int a[] = {10,5,8,20,6,2,12};
	    
	    int n = a.length;
	    
	    nextgreatest(a,n);
	  
	    
	}  


}
