package practise.Trees;

public class BinaryTree {

	Node root;
	
	
	BinaryTree() {
	
		root = null;
	}
	
	BinaryTree(int data){

      root = new Node(data);
	}
	
	public static void main(String[] args) {
       BinaryTree tree = new BinaryTree();
       
       tree.root = new Node(10);
       
       tree.root.left = new Node(15);
       tree.root.right = new Node(30);
       
       tree.root.left.left = new Node (40);
       
       tree.display(tree.root);

	}
	
	public void display(Node node) {
		
		
		if (node  == null)
			 return;
		
		
			display (node.left);
			System.out.println(node.data);
			display (node.right);
			
			
		}
	}
	



