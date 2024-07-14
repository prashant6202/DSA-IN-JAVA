package DSA.LinkedList_3.LinkedListdemo3;

public class LinkedList {
    private Node head;


    public void prepend(int x){
        Node p=new Node(x);
      // if wala condation nhi likhenge tb pr bhi code shi hai
        if (head==null){
            head=p;
            return;
        }
       p.setNext(head);
        head=p;
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


}
