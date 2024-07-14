package DSA.DynamicQueue;

public class UseQueue {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
        System.out.println("Top element of queue "+q.peek());
        System.out.println("dequeuing the element "+q.dequeue());
        System.out.println("Top element of queue "+q.peek());
        System.out.println("is Queue empty ?"+q.isEmpty());

    }
}
