package DSA.LinkedList_3.CircularLinkedList5.CircularLinkedListDemo1;

public class UseCLinkedList {
    public static void main(String[] args) {
        CLinkedList list=new CLinkedList();
//        list.addAtLast(10);
//        list.addAtLast(20);
//        list.addAtLast(30);
//        list.addAtLast(40);
//        list.addAtLast(50);

        list.prepend(2);
        list.prepend(4);
        list.prepend(6);
        list.prepend(8);

        list.printList();

//        int x=list.removeFirst();
//        System.out.println("After removing first node "+x);
//        list.printList();

//        int x=list.removeLast();
//        System.out.println("After removing first node "+x);
//        list.printList();

        System.out.println("Removing 2 ?"+list.removeData(2));
        list.printList();
        System.out.println("Removing 2 ?"+list.removeData(2));
        list.printList();
    }
}
