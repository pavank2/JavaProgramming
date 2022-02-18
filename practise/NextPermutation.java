package practise;

public class NextPermutation {

	public static void main(String[] args) {
	int n = 64748653;
	
	String s = String.valueOf(n);
		
	int len = s.length();
	
	char[] c = s.toCharArray();
	
	
	int i=len-1;
	char temp;
	int flag=1;
	while (i>0) {
		int j=i-1;
		while (j > 0) {
		if (c[i] > c[j] ) {
			temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			
			flag=0;
			break;
			
		}
		j--;
		}
		if (flag == 0)
			break;
		i--;
	}
		
	for (i=0;i<len;i++)
		System.out.print(c[i]);
	
	}

}
