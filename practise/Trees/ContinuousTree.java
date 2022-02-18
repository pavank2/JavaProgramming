package practise.Trees;
import practise.QueueWithNode;
// A tree is a Continuous tree if in each root to leaf path, 
// the absolute difference between keys of two adjacent nodes is 1.
public class ContinuousTree {
	

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		 Node root = new Node(3);
		    root.left     = new Node(2);
		    root.right     = new Node(4);
		    root.left.left = new Node(1);
		    root.left.right = new Node(3);
		    root.right.right = new Node(5);
		    root.right.right.right = new Node(7);
		    if(treeContinuous(root))
		    System.out.println( "Yes") ;
		    else
		    System.out.println( "No");

	}

	private static boolean treeContinuous(Node node) {
		
		if (node  == null)
			 return true;
		
if (node.left!=null && node.right == null)
		if (Math.abs(node.data - node.left.data)!= 1)
		    return false;
		
	if (node.right!=null && node.left == null)
			if (Math.abs(node.data - node.right.data)!= 1)
			    return false;
			
	if (node.left!=null && node.right!=null)	
		if (Math.abs(node.data - node.left.data)!= 1 || Math.abs(node.data - node.right.data)!= 1) {
			
		System.out.println("node.data:"+node.data);
		System.out.println("node.left.data:"+node.left.data);
		System.out.println("node.right.data:"+node.right.data);
			return false;
		}
		
		boolean left = treeContinuous(node.left);
		boolean right = treeContinuous(node.right);
		
		return left && right;	
	}

}
