package DSA.DynamicQueue;

import DSA.QUEUE_2.Queue1.QueueException;

public class Queue {
    private Node front,rear;
    private int count;
    public void enqueue(int x){
        Node p=new Node(x);
        count++;
        if (front == null) {
            front=p;
        }else {
            rear.setNext(p);
        }
        rear=p;
    }
    public int dequeue(){
        if (front == null) {
            throw new QueueException("Queue underflow");
        }
        count--;
        int x= front.getData();
        front=front.getNext();
        if (front == null) {
            rear=null;
        }
        return x;
    }
    public int peek(){
        if (front == null) {
            throw new QueueException("Queue underflow");
        }
        int x= front.getData();
        return x;
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
}
