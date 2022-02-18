package practise.Trees;
import practise.QueueWithNode;

public class SpiralBinaryTree {
	

public static void spiralTree (Node node) {
	Node temp = null;	
	QueueWithNode q = new QueueWithNode();
	
	q.enQueue(node);
	int i=1;
	while(!q.isEmpty()) {
		
	temp = q.deQueue();
	System.out.println(temp.data);
	if (i%2==1)	{
	 if (temp.left!=null)	
		q.enQueue(temp.left);
	 if (temp.right!=null)
		q.enQueue(temp.right);
	}
	
	else{
			 if (temp.right!=null)	
				q.enQueue(temp.right);
			 if (temp.left!=null)
				q.enQueue(temp.left);
		}
	
	 i++;
	}
}	
	 
	 public static void main(String[] args) {

			BinaryTree tree = new BinaryTree();
			tree.root = new Node(50); 
	        tree.root.left = new Node(40); 
	        tree.root.right = new Node(60);
	        tree.root.left.left = new Node(31); 
	        tree.root.left.right = new Node(49); 
	        tree.root.right.left = new Node (25);
	        
	        spiralTree(tree.root);
	        
  }
}
