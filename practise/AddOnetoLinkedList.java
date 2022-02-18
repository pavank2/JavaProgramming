package projects;
import projects.LinkedList.*;
public class AddOnetoLinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addNode(9);
        l.addNode(9);
        l.addNode(9);
        l.addNode(9);
        l.addNode(9);
        l.addNode(9);

     l.printList();
//        System.out.println("Head: "+l.head.data);
       l.head = reverseList(l);

        Node node = l.head;
        int carry=1;
        while (node!=null){
            node.data = node.data+carry;

            if (node.data == 10) {
                node.data = 0;
                carry = 1;
            } else
                break;
            node = node.next;
        }



        l.head = reverseList(l);
        if (carry == 1){
            l.addNode(1);
        }
        System.out.println("After addition");
        l.printList();

    }

    public static Node reverseList(LinkedList l){

        Node prev=null;
        Node curr=l.head;
        Node next=null;
        while(curr.next!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
         l.head = curr;
        l.head.next = prev;
        return l.head;
    }
}

