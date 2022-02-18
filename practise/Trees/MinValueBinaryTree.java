package practise.Trees;



public class MinValueBinaryTree {
 static int currmin;
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
		    
		    System.out.println(minValue(tree.root));
		 
	}
		    public static int minValue(Node node) {
		    	
		    	
	    	if (node == null)
		    		return Integer.MAX_VALUE;
	    	else {
	    	int min = node.data;
	    	int minLeft=0,minRight=0;
	    	 if(node.left != null){  
	    		 minLeft = minValue(node.left);  
                 //If min is greater than leftMin then store the value of leftMin into min  
                 min = Math.min(min, minLeft);  
               }  
		    	
	    	 if(node.right != null){  
	    		 minRight = minValue(node.right);  
                 //If min is greater than leftMin then store the value of leftMin into min  
                 min = Math.min(min, minRight);  
               }  
		    	
		    	
		    	if (minLeft < min)
		    		 min = minLeft;
		    	if (minRight < min)
		    		min = minRight;
		    	
		    	return min;
	    	}

	}

}
