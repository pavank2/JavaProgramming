package projects;

public class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data)
        {this.data = data; this.next=null;}
    }

    public void addNode(int data){

        Node node = new Node(data);
        node.next=head;
        head=node;
    }

    public void printList(){
        Node node = head;
        while (node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

//    public static void main(String[] args) {
//        projects.LinkedList l = new projects.LinkedList();
//        l.addNode(30);
//        l.addNode(20);
//        l.addNode(10);
//
//        l.printList();
//    }
}
