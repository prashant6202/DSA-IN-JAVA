package DSA.STACK_1.Expresion3_INFIX_TO_POSTFIX;

import java.util.Scanner;

public class UseConverter {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a valid infix exp:");
        String infix=kb.next();
        Converter obj=new Converter(infix);
        obj.toPostFix();
        System.out.println(obj);
    }
}
