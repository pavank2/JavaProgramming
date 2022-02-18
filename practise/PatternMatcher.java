package projects;

import java.util.ArrayList;
import java.util.HashMap;

public class PatternMatcher {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("aab");
        al.add("cbb");
        al.add("ssgg");

        String pattern="ddh";
        matchPattern(al,pattern);
    }

    public static void matchPattern(ArrayList<String> l, String pattern){
        String hash = encodeString(pattern);

        for (String s:l){
            if (s.length()==hash.length() && hash.equals(encodeString(s)))
                System.out.println(s);
        }
    }

    public static String encodeString(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        int j=0;
        int i=0;
        String res="";
        while(i<s.length()){
            char c = s.charAt(i);
            if(!hm.containsKey(c))
                hm.put(c,j++);

            res += hm.get(c);
            i++;
        }

        return res;
    }
}
