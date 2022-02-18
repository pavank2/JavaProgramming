package projects;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "HelloefewgH";

        char[] cs = s.toCharArray();

        int index=0;
        for (int i=0;i<cs.length;i++){
             int j;
            for(j=0;j<i;j++){
                if(cs[i] == cs[j])
                    break;
              }
            if(j==i)
                cs[index++] = cs[i];


        }

        System.out.println(String.valueOf(Arrays.copyOf(cs, index)));
   }
}
