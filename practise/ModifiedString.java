package projects;

public class ModifiedString {
    public static void main(String[] args) {
          String s="aaabbbbbccc";
           int count=0;
          for (int i=0;i<s.length()-2;i++){
              if (s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) == s.charAt(i+2)){
                  count++;
                  i++;
              }


          }

        System.out.println(count);
    }
}
