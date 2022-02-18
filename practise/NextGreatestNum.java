package projects;

import java.util.Stack;

public class NextGreatestNum {
    public static void main(String[] args) {
        int a[] = {10,5,8,20,6,2,12};

        int n = a.length;

        nextgreatest(a,n);
    }

    public static void nextgreatest(int[] a, int n){
        Stack<Integer> s = new Stack<>();
        int next=0,element=0;
        s.push(a[0]);
        for (int i=1;i<n;i++){
            next = a[i];
         if(!s.empty()) {
             element = s.pop();
             while (element < next) {
                 System.out.println("Next grestest element of " + element + " is " + next);
                 element = s.pop();
             }
            if(element > next)
                s.push(element);
         }
            s.push(next);
        }

        while (!s.isEmpty()){
            element = s.pop();
            next=-1;
            System.out.println("Next greatest to "+element+" is "+next);
        }
    }
}
