package practise;

/*Geek lost the password of his super locker. 
 * He remembers the number of digits N as well as the sum S of all the digits of his password. 
 * He know that his password is the largest number of N digits that can be made with given sum S. 
 * As he is busy doing his homework, help him retrieving his password.
 */
public class LargestNumGivenSum {

	public static void main(String[] args) {
		
		int N = 4,S= 29;
		int num = 0;
		
		//If S > max sum of digits, then no such number is possible
		
		if (N*9 < S) {
			System.out.println("There is no such number");
			return;
		}
		
		//Find the largest N digit number whose digits sum to S
		
		for (int i=N;i>0;i--) {
			if (S-9>=0) {
			   num += 9*Math.pow(10,i-1);
			   S -=9;
			} else if (S-9 <0) {
				num +=S*Math.pow(10,i-1);
				break;
			}
		}
     System.out.println(num);
	}

}
