package DSA.QUEUE_2.Queue2;
import java.util.Scanner;

public class UseQueue {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int choice,x;
       Queue obj=new Queue(5);
        do {
            System.out.println("Enter The Operation :");
            System.out.println("1.Enqueue \n 2.Dequeue \n 3.Peek \n 4.Quit");
            choice = kb.nextInt();
            switch (choice) {
                case 1:
                    try {
                    System.out.println("Enter element to insert:");
                    x = kb.nextInt();
                    obj.enqueue(x);
                    System.out.println("Inserted:" + x);
                } catch (QueueException ex) {
                    System.out.println(ex.getMessage());
                }
                break;

                case 2:
                    try {
                        x =obj.dequeue();
                        System.out.println("Deleted element " + x);
                    } catch (QueueException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 3:
                    try {
                        x =obj.peek();
                        System.out.println("Top element:" + x);
                    } catch (QueueException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Thanks for testing Queue.");
                    break;

                default:
                    System.out.println("Wrong choice! Try again.");
            }
        }while (choice!=4);
    }
}
