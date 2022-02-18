package projects;

import java.util.HashMap;

public class SubArraySumZero {
    public static void main(String[] args) {

        int[] a =  {2,3,4, 1,-5, -1,6,7};


        subSumZero(a);

    }

    public static void subSumZero(int[] a) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int currsum=0;
        int n = a.length;
        int start=-1,end=-1;
        for (int i=0;i<n;i++){
            currsum += a[i];
            if(currsum==0){
                System.out.println("Start:0 "+"end:"+i);
                return;
            }
        }
        currsum=0;
        for (int i=0;i<n;i++){
            currsum +=a[i];

            if(hm.containsKey(currsum)){
                start = hm.get(currsum)+1;
                end=i;
                System.out.println("Start:"+start+"end:"+i);
                return;
            }
            hm.put(currsum,i);
        }
    }

    }
