package projects;

import java.util.Arrays;

//Given a string and an integer k, find the number of substrings in which all the different characters occur exactly k times
public class NumberOfSubsK {

    public static void numOfSubsK(String s,int k){
        int n =s.length();
        int[] cnt = new int[26];
        for (int i=0;i<n;i++){
            Arrays.fill(cnt,0);
            int j=0;
            for (j=i;j<n;j++) {
                int index = s.charAt(j) - 'a';
                cnt[index]++;

                if (cnt[index] > k)
                    break;
               // int l=0;
                else if (cnt[index] == k) {
                    int l=0;
                    for (l = 0; l < 26; l++) {
                        if (cnt[l] != 0 || cnt[l] != k)
                            break;
                    }
                    if (l==26)
                        System.out.println(s.substring(i,j));
                }


            }


        }
    }

    public static void main(String[] args) {
        String s = "aabbcc";
        int k=2;

        numOfSubsK(s,k);

    }
}
