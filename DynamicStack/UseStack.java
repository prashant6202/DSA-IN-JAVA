package DSA.DynamicStack;

public class UseStack {
    public static void main(String[] args) {
        Stack s=new Stack();
        System.out.println("Is STACK empty ? "+s.isEmpty());
        System.out.println("Total size "+s.size());
        s.push(10);
        s.push(20);
        System.out.println("Total size "+s.size());
        System.out.println("Is STACK empty ? "+s.isEmpty());
        System.out.println("Top element "+s.peek());
        System.out.println("Popping element "+s.pop());
        System.out.println("Total size "+s.size());
        System.out.println("Is STACK empty ? "+s.isEmpty());
    }
}
