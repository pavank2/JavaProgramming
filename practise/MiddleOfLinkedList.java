package projects;
import projects.LinkedList.*;



public class MiddleOfLinkedList {

    public static void middleNode(LinkedList l){
      Node slow = l.head;
      Node fast = l.head;

      while (fast!=null && fast.next!=null){

          slow = slow.next;
          fast = fast.next.next;
      }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
       // l.addNode(40);
        l.addNode(36);
        l.addNode(35);
        l.addNode(30);
        l.addNode(20);
        l.addNode(15);
        l.addNode(10);

       middleNode(l);
        l.printList();
    }


}
