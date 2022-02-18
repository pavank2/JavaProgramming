package practise.Trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class BottomViewOfTree {
  
	static class Node
	{
	    int data; //data of the node
	    int hd; //horizontal distance of the node
	    Node left, right; //left and right references
	 
	    // Constructor of tree node
	    public Node(int key)
	    {
	        data = key;
	        hd = Integer.MAX_VALUE;
	        left = right = null;
	    }
	}
	 
	//Tree class
	static class Tree
	{
	    Node root; //root node of tree
	 
	    // Default constructor
	    public Tree() {}
	 
	    // Parameterized tree constructor
	    public Tree(Node node)
	    {
	        root = node;
	    }
	    
	    public void bottomView() {
	    	
	    	int hd=0;
	    	Node temp;
	    	TreeMap<Integer,Integer> m = new TreeMap<Integer,Integer>();
	    	
	    	Queue<Node> q = new LinkedList<Node>();	    
	    	
	    	q.add(root);
	    	root.hd = hd;
	    	
	    	while(!q.isEmpty()) {
	    		
	    		temp = q.remove();
	    		
	    		hd = temp.hd;
	    		
	    		m.put(hd, temp.data);
	    		
	    		if (temp.left!=null) {
	    			
	    			temp.left.hd = hd -1;
	    			q.add(temp.left);
	    		}
	    		
	    		if (temp.right!=null) {
	    			temp.right.hd = hd+1;
	    			q.add(temp.right);
	    		} 		
	    		
	    		
	    	}
	    	
	    	Set<Entry<Integer, Integer>> set = m.entrySet();
	    	 
	        // Make an iterator
	        Iterator<Entry<Integer, Integer>> iterator = set.iterator();
	 
	        // Traverse the map elements using the iterator.
	        while (iterator.hasNext())
	        {
	            Map.Entry<Integer, Integer> me = iterator.next();
	            System.out.print(me.getValue()+" ");
	        }
	    	
	    }
	    
	}	    
	public static void main(String[] args) {
		Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        Tree tree = new Tree(root);
        System.out.println("Bottom view of the given binary tree:");
        tree.bottomView();

	}

}
