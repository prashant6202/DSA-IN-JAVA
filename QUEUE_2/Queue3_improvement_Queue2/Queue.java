//Circular Queue
package DSA.QUEUE_2.Queue3_improvement_Queue2;

public class Queue {
    private int []arr;
    private int front,rear,size;
    public Queue(int size){
        arr=new int[size];
        this.size=size;
        front=-1;
        rear=-1;
    }

    public void enqueue(int x){
        if((rear+1)%size==front){
         throw new QueueException("Queue OVERFLOW");
        }
        rear=(rear+1)%size;
           arr[rear]=x;
           if(front==-1)
               front=0;
    }

    public int dequeue(){
        if(front==-1){
            throw new QueueException("Queue UNDERFLOW");
        }
        int x=arr[front];
        if (rear==front)
            rear=front=-1;
        else if (front==size-1)
            front=0;
        else
            front++;
        return x;
    }

    public int peek(){
        if (front==-1) {
            throw new QueueException("Queue UNDERFLOW");
        }
        int x=arr[front];
        return x;
    }
}
