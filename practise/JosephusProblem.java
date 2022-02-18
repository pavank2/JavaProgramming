package practise;

import java.util.ArrayList;

/*Given the total number of persons n and a number k which indicates that k-1 persons 
 * are skipped and kth person is killed in circle in a fixed direction.
The task is to choose the safe place in the circle so that when you perform 
these operations starting from 1st place in the circle, you are the last one
 remaining and survive.
*/
public class JosephusProblem {

	public static void main(String[] args) {

     int n=14,k=2;
     
     ArrayList<Integer> al = new ArrayList<>();
     
     for (int i=1;i<=n;i++) 
    	 al.add(i);
     
     int i=0;
     while (al.size() > 1) {
	 
    	 i=(i+k-1)%al.size();
    	 al.remove(i);
	 }
     
     System.out.println(al.get(0));

	}

}
