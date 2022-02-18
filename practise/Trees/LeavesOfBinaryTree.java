package practise.Trees;
import practise.QueueWithNode;

public class LeavesOfBinaryTree {

	public static void printLeaves (Node root) {
		
		Node temp = null;	

		
	
		QueueWithNode q = new QueueWithNode();
		
		q.enQueue(root);
		
		while(!q.isEmpty()) {
			
			temp = q.deQueue();
			
		 if (temp.left!=null)	
			q.enQueue(temp.left);
		 if (temp.right!=null)
			q.enQueue(temp.right);
		 
		 if (temp.left == null && temp.right == null) {
			 System.out.println("Leaf:"+temp.data);
		 }
		}
	}
	
	

public static void main(String[] args) {   
	BinaryTree tree = new BinaryTree();
	
	tree.root = new Node(10);  
	tree.root.left = new Node(11);  
	tree.root.left.left = new Node(7); 
	tree.root.left.left.left = new Node(22); 
	tree.root.left.right = new Node(12); 
	tree.root.right = new Node(9);  
	tree.root.right.left = new Node(15);  
	tree.root.right.right = new Node(8);
	
	 System.out.print("Inorder traversal:\n");  

      tree.display(tree.root);
	
	printLeaves (tree.root);
}
}
