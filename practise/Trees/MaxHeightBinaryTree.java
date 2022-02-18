package practise.Trees;
import practise.LinkedList.QueueWithNode;
public class MaxHeightBinaryTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		 Node root = new Node(3);
		    root.left     = new Node(2);
		    root.right     = new Node(4);
		    root.left.left = new Node(1);
		    root.left.right = new Node(3);
		    root.right.right = new Node(5);
		    root.right.right.right = new Node(7);
		    root.left.left.right = new Node(10);
		    root.left.left.right.left = new Node(14);
		    
		    System.out.println(maxHeight(root));
	
		    
    

	}

	private static int maxHeight(Node node) {
		
		int lheight=0,rheight=0,height=0;
		
		if (node==null)
			  return height;
		
		if (node.left == null && node.right == null)
			return 1;
		
		if (node.left!=null) {
			lheight= maxHeight(node.left)+1;
		}
		
		if (node.right!=null) {
			rheight= maxHeight(node.right)+1;
		}
	
		return (lheight>rheight)?lheight:rheight;
		
		
	}

}
