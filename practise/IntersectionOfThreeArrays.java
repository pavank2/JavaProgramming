package projects;

public class IntersectionOfThreeArrays {
    public static void main(String[] args) {
        int a[] = {1, 5, 10, 20, 40, 80,100};
        int b[] = {6, 7, 20, 80, 90,100};
        int c[] = {3, 4, 15, 20, 30, 70, 80, 120};

        int al=a.length,bl=b.length,cl=c.length;

        int i=0,j=0,k=0;

        while (i<al && j<bl && k<cl){
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.println(a[i]);
                i++;j++;k++;
            }
            else if (a[i] < b[j])
                i++;

                // y < z
            else if (b[j] < c[k])
                j++;

                // We reach here when x > y and z < y, i.e., z is smallest
            else
                k++;

        }
    }

    public static int maxValue(int a,int b,int c){
        if (a>b)
            if (a>c)
                return a;
            else
                return c;
         else
             if (b>c)
                 return b;
             else
                 return c;
    }
}
