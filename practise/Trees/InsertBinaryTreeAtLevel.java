//Given a binary tree and a key, insert the key into the binary tree
// at the first position available in level order.

package practise.Trees;
import practise.QueueWithNode;
public class InsertBinaryTreeAtLevel {

Node root;

	
	public InsertBinaryTreeAtLevel()  {
	
		root = null;
	}
	
	InsertBinaryTreeAtLevel(int data){				

      root = new Node(data);
	}
	
	public static void main(String[] args) {
	BinaryTree tree = new BinaryTree();
       
       tree.root = new Node(10);
       
       tree.root.left = new Node(15);
       tree.root.right = new Node(30);
       
       tree.root.left.left = new Node (40);
       
       tree.root.right.left = new Node(25);
       
       tree.display(tree.root);

       int key = 12 ; //Element to be inserted
       
     insert(tree.root,key);
       
       tree.display(tree.root);
	}
	
	public static void insert(Node node, int key) {
		
	QueueWithNode q = new QueueWithNode();
	
	q.enQueue(node);
	
	while (!q.isEmpty()) {
		
		Node temp = q.deQueue();
		if (temp.left == null) {
			 temp.left = new Node(key);
		    break;
	     } else {
	    	 q.enQueue(temp.left);
	     }
		 if (temp.right == null) {
			 temp.right = new Node (key);
			    break;
		} else {
		     q.enQueue(temp.right);
		}
	}
	  
	  
	}
	public void display(Node node) {
		
		
		if (node  == null)
			 return;
		   
		
			display (node.left);
			System.out.println(node.data);
			display (node.right);
			
			
	}
}
	


//class BinNode {
//	BinNode left,right;
//	int data;
//	
//	BinNode(int data){
//		this.data = data;
//		left=right=null;
//		
//	}
	

