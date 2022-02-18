package practise;

import java.util.ArrayList;


public class Fibonacci {
	public static void main(String[] args) {

           ArrayList<Integer> a = new ArrayList();
           
           a.add(1);
           a.add(1);
           int temp=0,i=0;
           
           System.out.println(a);
           
           while (i<10) {
        	   temp = a.get(i) + a.get(i+1);
        	   a.add(temp);
        	   i++;
           }
           System.out.println(a);

		}


}
