package DSA.LinkedList_3.LinkedListdemo2;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        System.out.println("Total no of Nodes: "+list.countNodes());
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.addAtLast(50);
        System.out.println("Total no of Nodes: "+list.countNodes());
        list.printList();

        System.out.println("Pos of 30 "+list.searchNode(30));
        System.out.println("Pos of 35 "+list.searchNode(35));
    }
}
