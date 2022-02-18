package practise.Trees;

public class DFSTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(50); 
        tree.root.left = new Node(40); 
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(31); 
        tree.root.left.right = new Node(49); 
        
        dfsTraversal(tree.root);

	}
	
	public static void dfsTraversal(Node node) {
		
		if (node == null)
			return;
		
		dfsTraversal(node.left);
		System.out.println(node.data);
	    dfsTraversal(node.right);
		
	}

}
