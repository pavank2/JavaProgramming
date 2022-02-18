package practise.Trees;
import practise.QueueWithNode;

public class FoldableBinaryTree {
	
	public static boolean isFoldable(Node leftNode,Node rightNode) {
		
		if (leftNode == null && rightNode == null)
			return true;
		
		if (leftNode == null || rightNode == null)
			return false;
		
//		if ((leftNode.left==null && rightNode.right!=null) || (leftNode.right==null && rightNode.left!=null))
//		        return false;
		
		return (isFoldable(leftNode.left,rightNode.right) && isFoldable(leftNode.right, rightNode.left));
		
	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.right.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.left.right.left = new Node(6); 
        tree.root.left.right.right = new Node(7); 

         
        if(isFoldable(tree.root.left,tree.root.right))
        	System.out.println("Yes");
        else
        	System.out.println("No");
	}

}
