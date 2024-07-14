package DSA.LinkedList_3.LinkedListdemo4;

public class LinkedList {
    private Node head;

    public void addAtLast(int x){

        Node p=new Node(x);
        if(head==null){
            head=p;
            return;
        }
        Node temp=head;
        while (temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(p);
    }

    public void printList(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }

    //1.removeFirst node from the list
    public void removeFirst(){
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.getNext() == null) {
            head=null;
            return;
        }
        head=head.getNext();
    }

    //1.removeLast node from the list ... using two pointer or refrence approch

    public void removeLast(){
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.getNext() == null) {
            head=null;
            return;
        }
        Node temp=head, prev=null;
        while (temp.getNext() != null) {
            prev=temp;
            temp=temp.getNext();
        }
        prev.setNext(null);

    }
//version 2 of removeLast node..... using single pointer or refrence approch
    public void removeLast2(){
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.getNext() == null) {
            head=null;
            return;
        }
        Node temp=head;
        while (temp.getNext().getNext() != null) {
            temp=temp.getNext();
        }
       temp.setNext(null);

    }
}
