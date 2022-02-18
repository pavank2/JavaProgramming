package practise.HashMap;

import java.util.HashMap;
import java.util.*;

public class NutsandBolts {

	public static void main(String[] args) {
		char nuts[] = {'@', '%', '$', '#', '^'};
		char bolts[] = {'%', '@', '#', '$','^'};
		
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		
			hm.put('#',0);
			hm.put('$', 1);
			hm.put('%', 2);
			hm.put('&', 3);
			hm.put('*', 4);
			hm.put('@', 6);
			hm.put('^', 7);
			
	HashMap<Character,Integer> hm1 = sortByValue(hm);
	
	
    for (Map.Entry<Character, Integer> aa : hm1.entrySet()) {
        System.out.println(aa.getKey()+" "+ aa.getValue());
    }
	
		for (int i=0;i<nuts.length;i++) {
			if (hm1.containsKey(nuts[i]))
				System.out.println(nuts[i]);
			
		}
		
	}
	
	public static HashMap<Character,Integer> sortByValue(HashMap<Character,Integer> hm){
		
		List<Map.Entry<Character,Integer>> ll = new LinkedList<Map.Entry<Character,Integer>>(hm.entrySet());
		
		Collections.sort(ll,new Comparator<Map.Entry<Character,Integer>>(){
			
			public int compare(Map.Entry<Character,Integer> o1,Map.Entry<Character,Integer> o2) {
				return (o1.getValue().compareTo(o2.getValue()));
				
			}
			
		});
		
		HashMap<Character, Integer> temp = new HashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : ll) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
		
	}

}
