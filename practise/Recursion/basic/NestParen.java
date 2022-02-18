package practise.Recursion.basic;

//nestParen("(())") → true
//nestParen("((()))") → true
//nestParen("(((x))") → false
public class NestParen {

	public static void main(String[] args) {
		
		String s = "((x))";
		
		System.out.println(nestParent(s));

	}

	public static boolean nestParent(String str) {
		
	//Not working
		int len = str.length();
		if(len == 0)
			return true;
		if(str.charAt(0) == '(' && str.charAt(len - 1) == ')')
				return nestParent(str.substring(1, len - 1));
		return false;
		}
	
}
