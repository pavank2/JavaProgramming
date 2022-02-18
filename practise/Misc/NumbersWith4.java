package practise.Misc;

public class NumbersWith4 {

	public static void main(String[] args) {
		
		int n = 443;
		int count=0;
		int div=0;
		for (int i=1;i<=n;i++) {
			int temp=i;
			while (temp>0) {
				div=temp%10;
				if (div == 4) {  // At any point, if remainder is 4, number contains 4
					count++;
					break;       //Break and move to next number
				}
				temp/=10;       //continue divide by 10 and checking remainder
				
			}
		}
		
		System.out.println(count);
	}

}
