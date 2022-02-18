package practise.Trees;

public class CheckBST {

	static int i=0;
	public static void inOrderTraversal(Node node,int[] arr) {
		
	//	static int[] arr = new int[10];
	
	if (node == null)
		return;
	
		inOrderTraversal(node.left,arr);
		arr[i++] = node.data;
	
		inOrderTraversal(node.right,arr);
		
	
	


}
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(50); 
        tree.root.left = new Node(40); 
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(31); 
        tree.root.left.right = new Node(49); 
//        tree.root.left.left.left = new Node(50); 
//        tree.root.left.left.left.right = new Node(26); 
//        tree.root.left.left.left.right.left = new Node(15);
//        tree.root.left.left.left.right.right = new Node(86);
        int[] arr = new int[5];
        
        //Inorder traversal
        
       inOrderTraversal(tree.root,arr);

   int  i=0, flag=1;
   	while (i<arr.length-1) {
   		
   		if (arr[i]>arr[i+1]) {
   			flag=0;
   			break;
   		}
   		i++;
   	}
   	
   	if (flag == 1)
   		System.out.println("Yes");
   	else
   		System.out.println("No");
	}

}
