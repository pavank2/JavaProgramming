package practise.Trees;

public class LeftViewBinaryTree {
	
	static int maxLevel = 0;
	public  static void leftView (Node node,int level) {
		
	if (node == null)
		return;
	
	
	if (maxLevel < level) {
		System.out.println(node.data);
		maxLevel = level;	
	}
	
			leftView(node.left,level+1);
			leftView(node.right,level+1);
		
	}

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10); 
        tree.root.left = new Node(22); 
        tree.root.left.left = new Node(31); 
        tree.root.right = new Node(14); 
        tree.root.right.right = new Node(50); 
        tree.root.right.right.left = new Node(26); 
        
        
        leftView(tree.root,1);
       
	}
}
