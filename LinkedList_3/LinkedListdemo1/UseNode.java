package DSA.LinkedList_3.LinkedListdemo1;

public class UseNode {
    public static void main(String[] args) {
         Node head;
         head= new Node();
         head.data=10;
         head.next=null;

         Node sec=new Node();
         sec.data=20;
         head.next=sec;

         Node third=new Node();
         third.data=30;
         sec.next=third;

         Node fourth=new Node();
         fourth.data=40;
         third.next=fourth;
         fourth.next=null;

         while (head!=null){
             System.out.println(head.data);
             head=head.next;
         }

    }
}
