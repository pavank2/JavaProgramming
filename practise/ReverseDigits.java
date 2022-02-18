package practise;
import java.lang.Math;

public class ReverseDigits {

	public static void main(String[] args) {
		
		int x = 200,length=0,reverse=0;
		
		int temp = x;
		
		while (temp!=0) {
			temp/=10;
			length+=1;
			
		}
		
		System.out.println(length);
		
       temp=x;
       int i=length-1;
	while (i>=0) {
		
		reverse+= (temp%10)*Math.pow(10,i);
		temp/=10;
			i--;
				
		
	}
       System.out.println(reverse);

}
}