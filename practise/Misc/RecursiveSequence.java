package practise.Misc;

public class RecursiveSequence {

	  static int j=1;
	public static void main(String[] args) {

     int n=5;
     int sum=0;
  for (int i=1;i<=n;i++) {
	int  count=0, temp=1;
	  
	  while(count<i) {
		  temp=temp*j;
		  j++;
		  count++;
	  }
	  sum=sum+temp;  
     }
     
  System.out.println(sum);
	}

}
