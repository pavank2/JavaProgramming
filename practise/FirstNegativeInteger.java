package projects;

public class FirstNegativeInteger {
    public void firstNegNumber(int[] a) {
     //   int a[] = {-8, 2, 3,1, -6, 10};
        int k=3;

        for (int i=0;i<a.length-k+1;i++){
            int j=0;
            for (j=i;j-i<k;j++){
                if (a[j]<0) {
                    System.out.println(a[j]);
                    break;
                }
            }
            if (j-i==k)
                System.out.println("No negative number in current window");
        }

    }
}
