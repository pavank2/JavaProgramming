package practise.Recursion;

public class sumDigits {

	public static void main(String[] args) {

int n = 7187377;

System.out.println(sumDigits(n));

	}
	
	public static int sumDigits(int n) {
		if (n == 0)
			return 0;
	 
		if (n%10 == 7)
		return (1+sumDigits(n/10));
		else
			return sumDigits(n/10);
	}

}
