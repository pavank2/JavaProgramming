package practise.Strings;

//Given a number s, find a smallest palindrome number greater than s.

public class GreaterPalindrome {

	public static void main(String[] args) {
		
		int num =12212;
		
		String s = String.valueOf(num);
		
		char c[] = s.toCharArray();
		int n = c.length;
		int i=0,j=0;
	if (n%2==0)	
		j =n/2;
	else
		j = (n/2)+1;
	
	i=(n/2)-1;
	int flag =0;
	
	 while (i>=0) {
			if (c[i] > c[j] && flag == 0) {
				c[j]=c[i];
				flag = 1;
			}
			else if (c[i] < c[j] && flag == 0) {
				c[i]=c[j];
				flag = 1;
			}
		else if (c[i] > c[j] && flag == 1){
			  c[i]=c[j];
		}
		else if (c[i] < c[j] && flag == 1) {
			c[j]=c[i];
		}
			i--;
			j++;
	 }

		System.out.println(c);
	}

	
}
