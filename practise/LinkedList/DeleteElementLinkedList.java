package practise.LinkedList;
import practise.LinkedList.SingleLinkedList;
import practise.LinkedList.SingleLinkedList.Node;

public class DeleteElementLinkedList {

	public static void main(String[] args) {
		SingleLinkedList l = new SingleLinkedList();
	     Node n1 = l.addNode(10);
	     Node n2 = l.addNode(3);
	     Node n3 = l.addNode(20);
	     Node n4 = l.addNode(25);
	     Node n5 = l.addNode(32);
	     Node n6 = l.addNode(91);
	     
	 
	     deleteNode(n3);

	     l.display();

	}
	
	public static void deleteNode(Node node) {
		
		    Node temp = node.next;
			node.data = temp.data;
			node.next = temp.next;
			temp = null;
		
		
		
	}

}
