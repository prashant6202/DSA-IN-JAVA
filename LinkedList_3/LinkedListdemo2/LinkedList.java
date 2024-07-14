package DSA.LinkedList_3.LinkedListdemo2;

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

    public int searchNode(int x){
        if (head==null){
            return 0;
        }
        Node temp=head;
        int pos=0;
        while (temp!=null){
            pos++;
            if (temp.getData()==x){
                return pos;
            }
            temp=temp.getNext();
        }
        return -1;
    }
}
