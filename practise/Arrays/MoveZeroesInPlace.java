package practise.Arrays;

public class MoveZeroesInPlace {

	public static void main(String[] args) {
		
		int[] a = { 2,1,0,0,4,5,0,0,12,8,6};
		
		int zerocount=0,lastnonzero=0;
		
		for (int i=0;i<a.length;i++) {
			if (a[i]==0) {
				zerocount++;
			}
		
		for (i=0;i<a.length;i++) {
			
			if (a[i]!=0) {
				a[lastnonzero]=a[i];
				lastnonzero++;
			}
			
		}
		
		for (i=lastnonzero;i<a.length-1;i++)
			a[i]=0;
		
		
		for (i=0;i<a.length-1;i++)
			System.out.println(a[i]);
		}
}

}