package projects;

//largest number of N digits that can be made with given sum S
//Input:
//N = 5, S = 12
//Output:
//93000
public class LargestNumberGivenSum {
    public static void main(String[] args) {
        int n=5, s=23;
 int largest=0;
        if (n*9 < s) {
            System.out.println("No such sum possible");
            return;
        }

        for (int i=n;i>=1;i--){
            if (s/9 > 0){
               largest +=9*Math.pow(10,i-1);
               s -= 9;
            } else if (s!=0){
                largest += (s%9)*Math.pow(10,i-1);
                s=0;
            }

        }

        System.out.println(largest);
    }
}
