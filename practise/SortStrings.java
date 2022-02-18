package practise;

import java.util.Arrays;

public class SortStrings {

	public static void main(String[] args) {
		String[] T = {"test1c","test1b","test1a"};
		
		Arrays.sort(T);
		
		for (int i=0;i<T.length;i++) {
			Character lastChar = T[i].charAt(T[i].length() - 2);
			int a = Integer.parseInt(String.valueOf(lastChar));
			System.out.println(a);
		}
		

	}

}
