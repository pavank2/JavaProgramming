package projects;

import java.util.Stack;

public class SpecialStack extends Stack<Integer>{
    Stack<Integer> minStack = new Stack<>();



 public void push(int data){
    if (isEmpty()){
        super.push(data);
        minStack.push(data);
    } else {
        super.push(data);
        if (data < minStack.peek())
            minStack.push(data);
    }


 }

 public Integer pop(){

        int item = super.pop();
        if (item == minStack.peek())
            minStack.pop();
        return item;
 }

 public int getMin(){
        return minStack.peek();
 }

    public static void main(String[] args) {
        SpecialStack s = new SpecialStack();

        s.push(30);
        s.push(10);
        System.out.println("Min:"+s.getMin());
        s.push(7);
        s.push(20);
        s.push(5);
        System.out.println("Min:"+s.getMin());
        s.pop();
        System.out.println("Min:"+s.getMin());

        //System.out.println(s);
    }
}
