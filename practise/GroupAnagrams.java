package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strList = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> group = new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>();

        for (String s:strList){
            char[] tempCharArr = s.toCharArray();
            Arrays.sort(tempCharArr);

           String tempStr = String.valueOf(tempCharArr);
            List<String> currentList = new ArrayList<>();
           if (hm.containsKey(tempStr)) {
                currentList = hm.get(tempStr);
               currentList.add(s);
               hm.put(tempStr, currentList);
           } else{
              currentList = new ArrayList<>();
               currentList.add(s);
               hm.put(tempStr,currentList);
           }

        }

        group.addAll(hm.values());
        System.out.println(group);
    }

}
