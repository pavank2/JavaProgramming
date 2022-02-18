package practise.Recursion.basic;

public class ChangeXY {

	public static void main(String[] args) {
		
		String s = "XXeferYXyiuyiYX";
		
		
		
		changeXY(s);

	}
	
	public static void changeXY(String s) {
		
		
		if (s.length() == 0) {
			System.out.print(s);
			return;
		}
		int n = s.length();
		changeXY(s.substring(0,n-1));
		
		
		if (s.charAt(n-1) == 'X')
			System.out.print('Y');
		else
			System.out.print(s.charAt(n-1));
		
		
	}

}
