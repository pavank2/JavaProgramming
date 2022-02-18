package projects;

public class ReverseWordsinString {
    public static void main(String[] args) {
        String s = "Hello this is me";
        String[] sa = s.split(" ");
        String ss="";
        for (int i=0;i<sa.length;i++){
            StringBuilder sb = new StringBuilder(sa[i]);
            String temp = sb.reverse().toString();
            ss += temp+ " ";
        }

        System.out.println(ss.trim());
    }
}
