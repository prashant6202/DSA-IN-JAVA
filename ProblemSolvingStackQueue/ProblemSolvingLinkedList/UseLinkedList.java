package DSA.ProblemSolvingStackQueue.ProblemSolvingLinkedList;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.addAtLast(50);

//        list.addAtPoss(10,0);
//        list.addAtPoss(20,0);
//        list.addAtPoss(30,2);
//        list.addAtPoss(40,1);

//        list.insert(7);
//        list.insert(3);
//        list.insert(12);
//        list.insert(9);

        System.out.println("Total no of Nodes: "+list.countNodes());
        list.printList();
//        System.out.println("Reverse linkedList is: ");
//        list.reverseList();

        list.reverse();
        System.out.println("After reversing");
        list.printList();
    }
}
