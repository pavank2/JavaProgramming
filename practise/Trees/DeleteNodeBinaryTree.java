package practise.Trees;
import practise.QueueWithNode;

public class DeleteNodeBinaryTree {
	
	public static void delete (Node root, int key) {
	//find Deepest	
		Node deepestNode = root;	
		
		//Search for node to be deleted
		
		QueueWithNode q = new QueueWithNode();
		
		q.enQueue(root);
		Node temp =null;
	    Node keyNode = null;
		
		while(!q.isEmpty()) {
			
			temp = q.deQueue();
			if (temp.data == key)
			{
				keyNode = temp;
			  
			}
			
		 if (temp.left!=null)	
			q.enQueue(temp.left);
		 if (temp.right!=null)
			q.enQueue(temp.right);
		}
		 //copy deepest node to temp node
		
		 deepestNode = temp;
		 System.out.println("Deepest node:"+deepestNode.data);
		 
		keyNode.data = deepestNode.data;
		deepestNode = null;
	
		return;
	}
		
		
		
	public static void main(String[] args) {
	InsertBinaryTreeAtLevel tree = new InsertBinaryTreeAtLevel();
	
       
	tree.root = new Node(10);  
	tree.root.left = new Node(11);  
	tree.root.left.left = new Node(7); 
	tree.root.left.right = new Node(12); 
	tree.root.right = new Node(9);  
	tree.root.right.left = new Node(15);  
	tree.root.right.right = new Node(8);  
  
    System.out.print("Inorder traversal " + 
                     "before deletion:\n");  
       
       tree.display(tree.root);

       int key = 11 ; //Element to be deleted
       
       delete(tree.root,key);
       
       tree.display(tree.root);
	}
}
