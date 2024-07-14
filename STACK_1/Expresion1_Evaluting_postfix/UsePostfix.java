package DSA.STACK_1.Expresion1_Evaluting_postfix;

import java.util.Scanner;

public class UsePostfix {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a valid postfix expression:");
        String ex=kb.next();
        Postfix obj=new Postfix(ex);
        System.out.println("Result of postfix expression is: "+obj.evaluate());
    }
}
