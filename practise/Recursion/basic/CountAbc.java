package practise.Recursion.basic;

public class CountAbc {

	public static void main(String[] args) {
		  String s = "XXefAbcXXXAbcAbcyiYX";
			System.out.println(countAbc(s));

		}
		
		public static int countAbc(String s) {
			
			
			if (s.length() == 0 || s.length() == 1 || s.length() == 2) {
				return 0;
			}
			
			String sub = s.substring(0,3);
			if (sub.equals("Abc"))
				return 1+countAbc(s.substring(1));
			
				return countAbc(s.substring(1));

	}

}
