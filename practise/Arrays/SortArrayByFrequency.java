package practise.Arrays;
import java.util.*;
import java.util.Map.Entry;

//Not working

public class SortArrayByFrequency {

	public static void main(String[] args) {
		int[] a ={9,9,9,2,5,5,4};
	    
		  HashMap<Integer,Integer> hm = new HashMap<>();
		  
		  for (int i=0;i<a.length;i++){
		     if (!hm.containsKey(a[i]))
		       hm.put(a[i],1);
		     else
		       hm.put(a[i],hm.get(a[i]+1));
		  }  
		  
		  
		  HashMap<Integer,Integer> hm1 = sortbyValue(hm);
		  int count=0,i=0;
		  for (Map.Entry<Integer,Integer> e : hm1.entrySet()) {
			  count = e.getValue();
			  
			  while (count>0) {
				  a[i++]=e.getKey();
				  count--;
			  }
		  }
				
		  for (i=0;i<a.length;i++)
			  System.out.println(a[i]);
	}

	public static HashMap<Integer,Integer> sortbyValue(HashMap<Integer,Integer> hm){
		
		List<Entry<Integer, Integer>> list =
	               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
	 
	        // Sort the list
	        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
	            public int compare(Map.Entry<Integer, Integer> o1,
	                               Map.Entry<Integer, Integer> o2)
	            {
	                return (o1.getValue()).compareTo(o2.getValue());
	            }
	        });
	         
	        // put data from sorted list to hashmap
	        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
	        for (Map.Entry<Integer, Integer> aa : list) {
	            temp.put(aa.getKey(), aa.getValue());
	        }
	        return temp;
	}
}
