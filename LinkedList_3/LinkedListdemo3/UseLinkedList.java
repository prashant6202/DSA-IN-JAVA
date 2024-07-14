package DSA.LinkedList_3.LinkedListdemo3;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        System.out.println("Total no of Nodes: "+list.countNodes());
        list.prepend(10);
        list.prepend(20);
        list.prepend(40);
        list.prepend(30);
        list.prepend(50);
        System.out.println("Total no of Nodes: "+list.countNodes());
        list.printList();

    }
}
