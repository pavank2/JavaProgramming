package practise.Trees;

public class SymmetricTree {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(50); 
        tree.root.left = new Node(20); 
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(40); 
        tree.root.left.right = new Node(30); 
        tree.root.right.left = new Node(30);
        tree.root.right.right = new Node(40); 
        
        System.out.println(checkSymmetry(tree.root));
	}

public static boolean checkSymmetry(Node node) {
	
	return (isMirror(node,node));
	
//	 Node leftTree=null,rightTree=null;
//	if (node == null)
//		return true;
//	else {
//	
//	if (node.left!=null) 
//		  leftTree = node.left;
//	if (node.right!=null) 
//		 rightTree = node.right;
//
//	
//	return(leftTree.data==rightTree.data && checkSymmetry(leftTree) && checkSymmetry(rightTree));

  }

private static boolean isMirror(Node node1, Node node2) {
	
	if (node1 == null && node2 == null)
		return true;
	
	if (node1!=null && node2!=null && node1.data == node2.data)
		return (isMirror(node1.left,node2.right) && isMirror(node1.left,node2.right));
	return false;
}


 
}	
