package DSA.STACK_1.STACKexample4UsingArrayList;
import java.util.ArrayList;
import java.util.List;
public class Stack {
    //1.declare premitive data member
    private List<Integer>myList;
    private int tos;

    //2.initlize both the data using constructor
    public Stack(){
        myList=new ArrayList<>();
        tos=-1;
    }

    //    3.Create push method
//    a> chek stack is full than show error message stack is OVERFLOW or return.
//     <b>if stack is not full than increment tos or add element
    public void push(int x) {
        tos++;
        myList.add(tos,x);
    }

    //4.create pop method
    //    a> chek stack is empty than show error message stack is UDNERFLOW or return.
//     <b>if stack is not empty than tos jisko point kr rha hai usko return krwa do or decrement toss.
    public int pop(){
        if(tos==-1){
            StackException obj=new StackException("Stack UNDERFLOW");
            throw obj;
        }
        int x= myList.remove(tos);
        tos--;
        return x;
    }

    //5.create peek method
    //    a> chek stack is empty than show error message stack is UDNERFLOW or return.
//     <b>if stack is not empty than tos jisko point kr rha hai usko return krwa do bs.

    public int peek(){
        if(tos==-1){
            StackException obj=new StackException("Stack UNDERFLOW");
            throw obj;
        }
        return myList.get(tos);
    }

}
