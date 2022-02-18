package projects;

public class MoveZerosInPlace {
    public static void main(String[] args) {
        int[] a = {2, 1, 0, 0, 4, 5, 0, 0, 12, 8, 6};
        int zerocount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                zerocount++;
        }
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }

        for (int i = j; i < a.length; i++)
            a[i] = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

