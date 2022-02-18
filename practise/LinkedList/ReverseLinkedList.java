package practise.LinkedList;

import StackAndQueue.StackImplementation;
import practise.LinkedList.SingleLinkedList.Node;

public class ReverseLinkedList {

	public static void main(String[] args) {
	
		SingleLinkedList l = new SingleLinkedList();
	     Node n1 = l.addNode(10);
	     Node n2 = l.addNode(3);
	     Node n3 = l.addNode(20);
	     Node n7 = l.addNode(35);
	     Node n4 = l.addNode(36);
	     Node n5 = l.addNode(81);
	     Node n6 = l.addNode(11);
	     
	 
	     reverseList(n1);
	     l.display();

	}

	private static void reverseList(Node head) {
		
		Node node=head;
		StackImplementation st = new StackImplementation();
		System.out.println("Pushing all data to stack");
		while (node!=null) {
			System.out.println(node.data);
			st.push(node.data);
			node = node.next;
		}
	//   st.push(node.data);
		System.out.println("Popping all data from stack");	
		node=head;
		while(st.top!=-1) {
			node.data = st.pop();
			node = node.next;
		}
		
		node = null;
			
	}

}
