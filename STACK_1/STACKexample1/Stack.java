package DSA.STACK_1.STACKexample1;

public class Stack {
    //1.declare premitive data member
    private int[]arr;
    private int tos;
    private int size;

    //2.initlize both the data using constructor
    public Stack(int size){
        arr=new int[size];
        tos=-1;
        this.size=size;
    }

    //    3.Create push method
//    a> chek stack is full than show error message stack is OVERFLOW or return.
//     <b>if stack is not full than increment tos or add element
    public void push(int x) {
        if (tos == size-1) {
            System.out.println("Stack is OVERFLOW");
            return ;
        }
        tos++;
        arr[tos]=x;
    }

    //4.create pop method
    //    a> chek stack is empty than show error message stack is UDNERFLOW or return.
//     <b>if stack is not empty than tos jisko point kr rha hai usko return krwa do or decrement toss.
    public int pop(){
        if(tos==-1){
            System.out.println("Stack is UNDERFLOW");
            return -1;
        }
        int x=arr[tos];
        tos--;
        return x;
    }

    //5.create peek method
    //    a> chek stack is empty than show error message stack is UDNERFLOW or return.
//     <b>if stack is not empty than tos jisko point kr rha hai usko return krwa do bs.

    public int peek(){
        if(tos==-1){
            System.out.println("Stack is UNDERFLOW");
            return 0;
        }
        int x=arr[tos];
        return x;
    }

}
