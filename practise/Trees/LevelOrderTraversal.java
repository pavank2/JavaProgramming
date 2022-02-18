package practise.Trees;

public class LevelOrderTraversal {
	
	public static int calculateHeight(Node node) {
		
		int lheight=0,rheight=0;
		
		if(node == null)
			return 0;
		
		if(node.left!=null)
			lheight= calculateHeight(node.left);
		if (node.right!=null)
		  rheight=calculateHeight(node.right);
		
		if (rheight>lheight)
			return (rheight+1);
		else 
			return (lheight+1);
		
	}
	
	public static void levelOrderTraversal(Node node) {
		
		int height = calculateHeight(node);
	   // System.out.println(height);
		
		for (int i=1; i<=height;i++) {
			printGivenLevel(node,i);
	}
	}
	private static void printGivenLevel(Node node, int level) {
		
		if (node == null)
			return;
		
		if (level == 1)
			System.out.println(node.data+" ");
		else if (level > 1)
		{
			printGivenLevel(node.left,level-1);
			printGivenLevel(node.right,level-1);
		}
	}

	public static void main(String[] args) {
     BinaryTree tree = new BinaryTree();
     
     tree.root = new Node(10); 
     tree.root.left = new Node(22); 
     tree.root.left.left = new Node(31); 
     tree.root.left.right = new Node(14); 
     tree.root.left.right.right = new Node(62); 
     tree.root.left.left.left = new Node(50); 
     tree.root.left.left.left.right = new Node(26); 
     tree.root.left.left.left.right.left = new Node(15);
     tree.root.right = new Node(30);
     tree.root.right.right = new Node(44);
     tree.root.right.right.left = new Node(86);
     tree.root.right.right.right = new Node(72);
     levelOrderTraversal(tree.root);
     

	}

}
