package DSA.LinkedList_3.DoublyLinkedList6;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private Node head;

    //1.add node at Last in doublyLinkedList
    public void addAtLast(int x){
      Node p=new Node(x);
        if (head == null) {
            head=p;
             return;
        }
        Node temp=head;
        while (temp.getNext() != null) {
            temp=temp.getNext();
        }
        temp.setNext(p);
        p.setPrev(temp);
    }

    //2.print doublyLinkedList

    public void printList(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp=head ,prev=null;
        System.out.println("Traversing forward direction.");

        while (temp!= null) {
            System.out.println(temp.getData());
            prev=temp;
            temp=temp.getNext();
        }

        System.out.println("Traversing backward direction.");
        while (prev != null) {
            System.out.println(prev.getData());
            prev = prev.getPrev();
        }
    }

    //3.add node at previous in doublyLinkedList
    public void prepend(int x){
        Node p=new Node(x);
        if (head == null) {
            head=p;
            return;
        }
        p.setNext(head);
        head.setPrev(p);
        head=p;
    }

    //4.remove first node in doublyLinkedList
    public int removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("Empty List");
        }
        int  x = head.getData();
//        if (head.getNext() == null) {
//            head = null;
//        } else {
//            head = head.getNext();
//            head.setPrev(null);
//        }
//        return x;
        head=head.getNext();
        if (head != null) {
          head.setPrev(null);
        }
        return x;
    }

    //5. remove last node from doublyLinkedList
    public int removeLast(){
        if (head == null) {
            throw new NoSuchElementException("List Empty");
        }
        int x=head.getData();
        if (head.getNext()== null) {
            head=null;
            return x;
        }
        Node temp=head;
        while (temp.getNext() != null) {
            temp=temp.getNext();
        }
        x= temp.getData();
        temp.getPrev().setNext(null);
        return x;
    }

    //6. remove data from the doublyLinkedList
    public boolean removeData(int x){
        if (head == null) {
            throw new NoSuchElementException("Empty list");
        }
        if (head.getData() == x) {
            if (head.getNext() == null) {
                head=null;
                return true;
            }
            head=head.getNext();
            head.setPrev(null);
            return true;
        }
        Node temp=head;
        while (temp != null && temp.getData() != x) {
            temp=temp.getNext();
        }
        if (temp == null) {
            return false;
        }
        temp.getPrev().setNext(temp.getNext());
        if (temp.getNext() != null) {
            temp.getNext().setPrev(temp.getPrev());
        }
        return true;
    }
}
