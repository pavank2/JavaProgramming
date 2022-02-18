package practise.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;



public class MiddleElementLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Steve");
		list.add("Rogers");
		list.add("Captain");
		list.add("America");
		
		list.addFirst("Avengers");
		list.addLast("Assemble");
		
		Iterator<String> it = list.iterator();
		
		int len = list.size();
		
		System.out.println("Middle element:"+ list.get(len/2));

	}

}
