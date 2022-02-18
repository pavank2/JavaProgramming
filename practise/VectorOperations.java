package practise;

import java.util.Vector;

public class VectorOperations {

	public static void main(String[] args) {
		
	//Generic vector	
		Vector v = new Vector();
		v.add("Batman");
		v.add("Superman");
		v.add(1,"vs");
		v.set(1, "versus");
		System.out.println("Elements in Vector v");
		for (int i=0;i<v.size();i++)
			System.out.println(v.get(i));
	
	//Integer vector	
		Vector<Integer> v2 = new Vector<Integer>();
		
		v2.add(10);
		v2.add(20);
		v2.add(30);
		v2.remove(1);
		
	
		System.out.println("Elements in vector v2:"+v2);
		
		System.out.println("Another way of iterating");
		
		for (int j:v2) {
			System.out.println(j);
		}
	}

}
