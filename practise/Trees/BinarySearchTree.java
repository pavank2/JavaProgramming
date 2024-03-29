package practise.Trees;

public class BinarySearchTree {

	class Node{
		 int key;
		 Node left,right;
		     
		 Node(int key){
		       this.key = key;
		       left=right=null;
		  }
		     
	}
		  
		Node root;
		BinarySearchTree(){
		    root = null;
		  }
		     
		     void insert(int key)
		    {
		         root = insertRec(root, key);
		    }
		 
		    /* A recursive function to
		       insert a new key in BST */
		    Node insertRec(Node root, int key)
		    {
		 
		        /* If the tree is empty,
		           return a new node */
		        if (root == null)
		        {
		            root = new Node(key);
		            return root;
		        }
		 
		        /* Otherwise, recur down the tree */
		        if (key < root.key)
		            root.left = insertRec(root.left, key);
		        else if (key > root.key)
		            root.right = insertRec(root.right, key);
		 
		        /* return the (unchanged) node pointer */
		        return root;
		    }
		 
		    // This method mainly calls InorderRec()
		    void inorder()
		    {
		         inorderRec(root);
		    }
		     
		     void inorderRec(Node root)
		      {
		        if (root != null) {
		            inorderRec(root.left);
		            System.out.println(root.key);
		            inorderRec(root.right);
		        }
		      }
		  
		 
		
		  public static void main(String[] args) {
		    

		  BinarySearchTree tree = new BinarySearchTree();
		 
		        
		        tree.insert(50);
		        tree.insert(30);
		        tree.insert(20);
		        tree.insert(40);
		        tree.insert(70);
		        tree.insert(60);
		        tree.insert(80);
		 
		      
		       tree.inorder();
		    
		  }
	} 


