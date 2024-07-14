package DSA.STACK_1.STACKexample1;

public class UseStack {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        int x=10;
        System.out.println("Pushing the data into the STACK");
        for(int i=1;i<=5;i++){
            s.push(x);
            System.out.println("Pushed:"+x);
            x=x+10;
        }
        System.out.println("top element in the stack is "+s.peek());
        System.out.println("Pop the data from the stack");
        for (int i=1;i<=5;i++){
            System.out.println(s.pop());
        }
    }

}
