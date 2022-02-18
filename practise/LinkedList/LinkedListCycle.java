package practise.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;

import practise.LinkedList.SingleLinkedList.Node;

public class LinkedListCycle {

	public static void main(String[] args) {
		
		SingleLinkedList ll = new SingleLinkedList();
		Node node1 = ll.addNode(30);
		Node node2 =ll.addNode(40);
		Node node3 = ll.addNode(10);
		Node node4 = ll.addNode(50);
		
		
		ll.head.next.next.next= node2;
		
		Node node = ll.head;
		
		while (node.next!=null)
		{
			
			if (node.flag == 1) {
			
				System.out.println("loop!");
				System.out.println(node.data);
				return;
			}
			node.flag = 1;
			node = node.next;
			
		}
		
		System.out.println("No loop!");
		
		
		
		
		
	}

}
