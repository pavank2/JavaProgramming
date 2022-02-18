package practise.Trees;

public class CheckBST2 {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(50); 
        tree.root.left = new Node(40); 
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(39); 
        tree.root.left.right = new Node(49); 
        
        
        System.out.println(checkBST(tree.root));
	}

	public static boolean checkBST(Node node) {
		
		if (node == null)
			return true;
	
//	 if(node.left!=null && node.right!=null)	
//		if (node.left.data > node.data || node.right.data < node.data)
//				return false;
	 
	 
      if (node.left!=null && maxValue(node.left) >= node.data)
    	  return false;
      
      if (node.right!=null && minValue(node.left) <= node.data)
    	  return false;
      
      if (!checkBST(node.left) || !checkBST(node.right))
    	  return false;
      
      return true;
		
	
	}
}
