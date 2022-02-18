package practise.Trees;

public class SortedArrayToBST {

	public static void main(String[] args) {

     int[] a = {1,2,3,4,5,6,7,8,9,10};
     BinaryTree tree = new BinaryTree();
        int low = 0;
		int high = a.length-1;
        tree.root = sortedArraytoBST(a,low,high);

	}

	public static Node sortedArraytoBST(int[] a,int low,int high) {
			
		if (low > high)
			return null;
		int mid = (low+high)/2;
		
		Node node = new Node(a[mid]);
	
		System.out.println(node.data);
		node.left = sortedArraytoBST(a,low,mid-1);
		node.right = sortedArraytoBST(a,mid+1,high);

	  return node;
	}
}
