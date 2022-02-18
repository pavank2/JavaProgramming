package practise.LinkedList;


public class SingleLinkedList {
	
	class Node {
		int data;
		Node next;
	    int flag;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	 }
	
	}
	public Node head = null;
	public Node tail = null;
	
	public Node addNode(int data) {
	
	Node newNode = new Node(data);
	
	if (head == null) {
		
		head = newNode;
		tail = newNode;
	} else {
		tail.next = newNode;
		tail = newNode;
	}
	newNode.flag=0;
	return newNode;
}

public void display() {
	Node current = head;
	if (current == null) 
		System.out.println("Nothing to display");
	
	while (current!=null) {
		System.out.println(current.data);
		current = current.next;
	}
}


	public static void main (String[] args) {
     SingleLinkedList l = new SingleLinkedList();
     Node n1= l.addNode(10);
     Node n2 = l.addNode(3);
     Node n3 = l.addNode(20);

     l.display();
	}
  
}
