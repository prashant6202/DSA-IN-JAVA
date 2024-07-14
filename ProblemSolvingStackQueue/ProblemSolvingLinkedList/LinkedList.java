package DSA.ProblemSolvingStackQueue.ProblemSolvingLinkedList;

import java.util.NoSuchElementException;
import java.util.Stack;

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


    public int countNodes(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
           temp=temp.getNext();
        }
        return count;
    }


    //1. reverse print linkedList

    public void reverseList(){
        Stack<Integer>st=new Stack<>();
        Node temp=head;
        while (temp!=null){
            int x= temp.getData();
            st.push(x);
            temp=temp.getNext();
        }
        while (!st.empty()){
            System.out.println(st.pop());
        }
    }

     //2.addAtPoss method created

    public void addAtPoss(int x,int pos){
        if (pos<0||pos>countNodes()){
           throw new  IllegalArgumentException("Invalid position");
        }
        Node p=new Node(x);
        if(pos==0){
            p.setNext(head);
            head=p;
            return;
        }
        Node temp=head;
        int i=0;
        while (i < pos - 1) {
            i++;
            temp=temp.getNext();
        }
        p.setNext(temp.getNext());
        temp.setNext(p);
    }

    //3.Insert method create

    public void insert(int x){
        Node p=new Node(x);
        if (head == null) {
            p.setNext(head);
            head=p;
            return;
        }
        if (x < head.getData()) {
            p.setNext(head);
            head=p;
            return;
        }
        Node temp=head,prev=null;
        while (temp!=null && temp.getData()<x){
            prev=temp;
            temp=temp.getNext();
        }
        if (temp == null) {
            prev.setNext(p);
        }else {
            prev.setNext(p);
            p.setNext(temp);
        }
    }

    //4.reverse linked list
    public void reverse(){
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        Node prev=null,current=head,next;
        while (current != null) {
            next=current.getNext();
            current.setNext(prev);
           prev=current;
           current=next;
        }
        head=prev;
    }

    //5.deleteNthNodeFromLast
    public void deleteNthNodeFromLast(int pos){
        int count=countNodes();
        if (pos <= 0 || pos > count) {
            throw new IllegalArgumentException("Invalid position");
        }
        int diff=count-pos;
        int i=1;
        Node temp=head;
        while (i < diff) {
            temp=temp.getNext();
            i++;
        }
        if (diff == 0) {
            head=head.getNext();
        }else {
            temp.setNext(temp.getNext().getNext());
        }
    }

}
