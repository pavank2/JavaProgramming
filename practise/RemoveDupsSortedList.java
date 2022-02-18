package projects;
import projects.LinkedList.*;

public class RemoveDupsSortedList {

  public static void removeDups(LinkedList l){
//      Node curr = l.head;
//
//      while (curr!=null){
//          Node temp = curr;
//
//          while (temp!=null && temp.data == curr.data)
//              temp = temp.next;
//
//          curr.next = temp;
//          curr = curr.next;
//
//      }

      Node temp = l.head;

      while (temp.next!=null) {

          if (temp.data == temp.next.data)
              temp.next = temp.next.next;
          else
              temp = temp.next;

      }
      }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addNode(40);
        l.addNode(30);
        l.addNode(30);
        l.addNode(30);
        l.addNode(20);
        l.addNode(10);
        l.addNode(10);

        removeDups(l);
        l.printList();
    }

}
