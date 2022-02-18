//List out array with only unique elements

package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {
	public static void main(String[] args) {
		
		int a[]= {10,15,32,45,32,6 ,8,10,32};
		
		
	List<Integer> list = new ArrayList<Integer>(a.length);
	
	int i =0;
	while (i<a.length-1) {
		list.add(a[i]);
		i++;
	}
	
	Set<Integer> listNoDup = new LinkedHashSet<Integer>(list);
	
	list.clear();
	
	list.addAll(listNoDup);
	
	System.out.println(listNoDup);
	
	}
}