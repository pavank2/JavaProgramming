package practise.LinkedList;

import java.util.LinkedList;

import practise.LinkedList.SingleLinkedList.Node;

public class AddTwoNumbers {

	public static void main(String[] args) {
	
		SingleLinkedList l1 = new SingleLinkedList();
	     Node n1 = l1.addNode(6);
	     Node n2 = l1.addNode(3);
	     Node n3 = l1.addNode(2);
	     
	     SingleLinkedList l2 = new SingleLinkedList();
	     Node n4 = l2.addNode(9);
	     Node n5 = l2.addNode(5);
	     Node n6 = l2.addNode(9);
	    Node n7 = l2.addNode(9);
	     
	     addTwoNumbers(n1,n4);

	}
	
	public static void addTwoNumbers(Node n1,Node n2) {
	
	 SingleLinkedList l3 = new SingleLinkedList();
     
	  Node tempnode1 = n1,tempnode2 = n2;
	  int tempValue=0, remainder=0;
     
	
	 while (tempnode1!=null || tempnode2!=null) {
		 
		 if (tempnode1 == null) {
			 tempValue= tempnode2.data+remainder;
		 System.out.println(tempValue);
		 }
		 
		 else if (tempnode2 == null) {
			 tempValue= tempnode1.data+remainder;
		 System.out.println(tempValue);
		 }
		 else {
		 tempValue= tempnode1.data+tempnode2.data+remainder;
		 
		 
		 if (tempValue>=10) {
			 remainder = tempValue/10;
			 l3.addNode(tempValue%10);
			 System.out.println(tempValue%10);
		 } else {
			 l3.addNode(tempValue);
			 remainder=0;
		 System.out.println(tempValue);
		 }
		 
		 tempnode1 = tempnode1.next;
		 tempnode2 = tempnode2.next;
		 
		 }
		 
	 } 
	
	 }

}
