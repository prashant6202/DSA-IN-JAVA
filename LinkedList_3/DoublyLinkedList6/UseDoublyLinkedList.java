package DSA.LinkedList_3.DoublyLinkedList6;

public class UseDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dList=new DoublyLinkedList();
//        dList.addAtLast(10);
//        dList.addAtLast(20);
//        dList.addAtLast(30);
//        dList.addAtLast(40);
//        dList.addAtLast(50);
        dList.prepend(10);
        dList.prepend(20);
        dList.prepend(30);
        dList.prepend(40);
        dList.printList();

        System.out.println("remove the first node "+dList.removeFirst());
        dList.printList();
    }
}
