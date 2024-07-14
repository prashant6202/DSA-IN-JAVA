
//Linear Queue  --->drawback  element delete krenge tb queue khali ho jayega jb insert krenge
// element tb Queue is OVERFLOW ka message aayega

package DSA.QUEUE_2.Queue1;

public class Queue {

    private int[]arr;
    private int front,rare,size;

    public Queue(int size) {
       this.arr=new int[size];
        front=0;
        rare=-1;
        this.size=size;
    }

    //create enqueue() method and check 1.overflow queue full than throw exception.agr nhi hai to
    //rare ko increment by 1 and insert the element  in arr
    public void enqueue(int x){
        if(rare==size-1){
            QueueException ex=new QueueException("Queue OVERFLOW");
            throw ex;
        }
        rare++;
        arr[rare]=x;
    }

    /*
    create dequeue() method and check underflow->in one situation agr front > rarer or element
    ko dequeue kr rhe tb.
    */
    public int dequeue(){
        if(front>rare){
            throw new QueueException("Queue UNDERFLOW");
        }
       int x=arr[front];
        front++;
        return x;
        //3 line in one line
        // return arr[front++];
    }

    // create peek method
    public int peek(){
        if(front>rare){
            throw new QueueException("Queue UNDERFLOW");
        }
        int x=arr[front];
        return x;
    }
}
