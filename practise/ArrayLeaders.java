package projects;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {
    public static void main(String[] args) {
        int[] a = {24, 32, 102, 8, 97, 20,17,36};

        List<Integer> leaderList = new ArrayList<>();
        int n = a.length;
        leaderList.add(a[n-1]);
        int maxSofar = a[n-1];

        for (int i=n-2;i>=0;i--){
            if (a[i] > maxSofar){
                maxSofar = a[i];
                leaderList.add(a[i]);
            }
        }
        System.out.println(leaderList);
    }
}
