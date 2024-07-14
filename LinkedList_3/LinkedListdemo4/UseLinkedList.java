package DSA.LinkedList_3.LinkedListdemo4;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.addAtLast(50);

         list.printList();
//         list.removeFirst();
//        System.out.println("After removing First node");
        list.removeLast();
        System.out.println("After removing last node");
        list.printList();
    }
}
