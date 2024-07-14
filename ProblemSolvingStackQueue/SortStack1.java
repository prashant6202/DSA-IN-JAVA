package DSA.ProblemSolvingStackQueue;

import java.util.Stack;

public class SortStack1 {
    public static void sort(Stack<Integer> s1){
        Stack<Integer>s2=new Stack<>();
        while (s1.empty()==false){
            int x=s1.pop();
            while (s2.empty()==false&&s2.peek()>x){
                s1.push(s2.pop());
            }
            s2.push(x);
        }

        while (s2.empty()==false){
            s1.push(s2.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer>s1=new Stack<>();
        s1.push(10);
        s1.push(2);
        s1.push(3);
        s1.push(40);
        s1.push(5);
        sort(s1);
        System.out.println("Sorted element s1 is");
        while (s1.empty()==false){
            System.out.println(s1.pop());
        }
    }
}
