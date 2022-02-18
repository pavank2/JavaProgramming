package practise.LinkedList;

import practise.LinkedList.SingleLinkedList.Node;

public class DuplicatesLinkedList {

	public static void main(String[] args) {

		SingleLinkedList ll = new SingleLinkedList();
	     Node head = ll.addNode(10);
		 ll.addNode(10);
		 ll.addNode(30);
		 ll.addNode(30);
		 ll.addNode(30);
		 ll.addNode(40);
		 
		Node temp = head;
	
		 while (temp.next!=null) {
 		 
			 if (temp.data == temp.next.data)
				 temp.next = temp.next.next;
			 else
				 temp = temp.next;
			
			
			 
		 }
		
		ll.display();

	}

}
