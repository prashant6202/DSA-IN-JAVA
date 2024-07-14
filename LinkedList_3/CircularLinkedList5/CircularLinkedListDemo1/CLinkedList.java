package DSA.LinkedList_3.CircularLinkedList5.CircularLinkedListDemo1;

import com.sun.security.jgss.GSSUtil;

import java.util.NoSuchElementException;

public class CLinkedList {
    private Node head;

    //1.add node at last in circular Linked List
    public void addAtLast(int x) {
        Node p=new Node(x);
        if (head == null) {
            head=p;
            p.setNext(p);
            return;
        }
        Node temp=head;
        while (temp.getNext() != head) {
            temp=temp.getNext();
        }
        temp.setNext(p);
        p.setNext(head);

    }

    //2.print circular Linked List
    public void printList(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
      do {
            System.out.println(temp.getData());
            temp=temp.getNext();
        }while (temp!=head);
    }

    //3.add node at previous in circular Linked List

    public void prepend(int x){
        Node p=new Node(x);
        if (head == null) {
            head=p;
            p.setNext(p);
            return;
        }
        Node temp=head;
        while (temp.getNext() != head) {
            temp=temp.getNext();
        }
        p.setNext(head);
        head=p;
        temp.setNext(p);
    }

    //4.remove node at first in circular Linked List

    public int removeFirst(){
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        int x=head.getData();
        if (head.getNext() == head) {
            head=null;
            return x;
        }
        Node temp=head;
        while (temp.getNext() != head) {
            temp=temp.getNext();
        }
       head= head.getNext();
        temp.setNext(head);
        return x;
    }

    //5.remove node at last in circular Linked List

    public int removeLast(){
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        int x;
        if (head.getNext() == head) {
           x =head.getData();
            head=null;
            return x;
        }
        Node temp=head,prev=null;
        while (temp.getNext() != head) {
            prev=temp;
            temp=temp.getNext();
        }
        x=temp.getData();
        prev.setNext(head);
        return x;
    }

    //6.remove node at last version2 in circular Linked List

    public int removeLast2(){
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        int x;
        if (head.getNext() == head) {
            x =head.getData();
            head=null;
            return x;
        }
        Node temp=head;
        while (temp.getNext().getNext() != head) {
            temp=temp.getNext();
        }
        x=temp.getNext().getData();
        temp.setNext(head);
        return x;
    }

    //7.remove data which match in circular Linked List
    public boolean removeData(int x){
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        if (head.getData()==x) {
            if (head.getNext() == head) {
                head=null;
                return true;
            }

           Node temp=head;
            while (temp.getNext() != head) {
                temp=temp.getNext();
            }
            head=head.getNext();
            temp.setNext(head);
            return true;
        }

        Node temp=head,prev=null;
        while (temp.getNext() != head && temp.getData() != x) {
            prev=temp;
            temp=temp.getNext();
        }
        if (temp.getData() == x) {
            prev.setNext(temp.getNext());
            return true;
        }
        return false;
    }

}
