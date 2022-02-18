package practise.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

import practise.LinkedList.SingleLinkedList;
import practise.LinkedList.SingleLinkedList.Node;

public class LinkedListPalindrome {

	public static void main(String[] args) {

		SingleLinkedList l = new SingleLinkedList();
	     Node n1 = l.addNode(10);
	     Node n2 = l.addNode(3);
	     Node n3 = l.addNode(20);
	     Node n7 = l.addNode(35);
	     Node n4 = l.addNode(20);
	     Node n5 = l.addNode(3);
	     Node n6 = l.addNode(10);
	     
	 
	     System.out.println(isPalindrome(n1));

}
	
public static boolean isPalindrome(Node head) {
	
	Node regular = head;
	Node faster = head;
	
	//To check if LL length is odd or even
	int len=1;
	while (head.next!=null) {
		len+=1;
		head=head.next;
	}
	System.out.println(len);
	ArrayList<Integer> al = new ArrayList<Integer>();

	//Reach middle
	while (faster!=null && faster.next!=null) {
		al.add(regular.data);
		regular = regular.next;
		faster = faster.next.next;
	}
	
	if (len%2 == 1)
	  regular = regular.next;
	//compare 2nd half of the linked list to reverse of arraylist
	int i = al.size();
	
	while (regular.next!=null) {
		
		if (al.get(i-1)!=regular.data) { //compare 1st half data in AL to 2nd half data in LL
			return false;		
		}
		
		i-=1;
		regular = regular.next;
	 }
	
     return true;   
   }

}
