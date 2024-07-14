package DSA.STACK_1.Expresion2_Evaluting_prefix;

import java.util.Scanner;

public class UsePrefix {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a valid prefix expression:");
        String ex=kb.next();
        Prefix obj=new Prefix(ex);
        System.out.println("Result of prefix expression is: "+obj.evaluate());
    }
}
