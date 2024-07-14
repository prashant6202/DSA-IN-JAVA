package DSA.DynamicStack;

import DSA.STACK_1.STACKexample2Expceptionhandling.StackException;

public class Stack {
    private Node tos;
    private int count=0;
    public void push(int x){
        Node p=new Node(x);
        p.setNext(tos);
        tos=p;
        count++;
    }
    public int pop(){
        if (tos == null) {
            throw new StackException("Stack Underflow");
        }
        int x=tos.getData();
        tos=tos.getNext();
        count--;
        return x;
    }
    public int peek(){
        if (tos == null) {
            throw new StackException("Stack Underflow");
        }
        int x=tos.getData();
        return x;
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
}
