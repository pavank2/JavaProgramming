package practise.Arrays;

import java.util.ArrayList;
import java.util.List;

public class AliceAndBob {

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<>();
		a.add(3);
		a.add(6);
		a.add(2);
		
		List<Integer> b = new ArrayList<>();
		b.add(7);
		b.add(9);
		b.add(8);
		
		System.out.println(compareTriplets(a, b));		
	}
	
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	      
	 
	      List<Integer> score = new ArrayList<>();
	      score.add(0);
	      score.add(0);
	      
	      for (int i=0;i<a.size();i++) {
	    	  if (a.get(i) > b.get(i))
	    		  score.set(0,score.get(0)+1);
	    	  else if (a.get(i) < b.get(i))
	    		  score.set(1,score.get(1)+1);
	      }

	      return score;
	    }
}
