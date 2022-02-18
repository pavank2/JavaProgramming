package projects;
//Given a sorted array arr[] and a value X, find the k closest elements to X in arr[].
public class KClosestElements {
    public static void main(String[] args) {
        int[]  a = {12, 16, 22, 30, 35, 39, 42,
                45, 48, 50, 53, 55, 56};
        int x = 14;
        int k=4;
        int storek=4;
        int l=0,r=0;
        int[] min = new int[k];
        for (int i=0;i<a.length;i++){
            if(a[i] < x && a[i+1] > x){
                l=i;
                r=i+1;
                break;
            } else if (a[i] == x){
                l=i-1;
                r=i+1;
                break;
            }

        }

        System.out.println("l: "+l+" r: "+r);
        int j=0;
        while (l>=0 && r <=a.length-1){

            if (Math.abs(a[l] - x) < Math.abs(a[r] - x)){
                min[j++]= a[l];
                l--;

            } else{
                min[j++] = a[r];
                r++;
            }
            k--;
            if (k==0)
                break;

        }

        for (int i=0;i<storek;i++)
            System.out.println(min[i]);
    }
}
