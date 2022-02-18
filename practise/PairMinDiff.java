package projects;

//Given a sorted array and a number x, find the pair in array whose sum is closest to x
public class PairMinDiff {
    public static void main(String[] args) {
        int[] a = {2,3,6,10,20};
        int x = 42;
        int l=0,r = a.length -1;
        int li=0, ri=a.length-1;
        int sum=0,diff=Integer.MAX_VALUE;
        while (l<r){
            int currdiff = Math.abs((a[l]+a[r]) - x);
            if ( currdiff < diff) {
                li = l;
                ri = r;
                diff = currdiff;
            }
                if (a[l]+a[r] > x)
                    r--;
                else
                    l++;

            }

        System.out.println("Indexes: "+li+" "+ri);
        }


}
