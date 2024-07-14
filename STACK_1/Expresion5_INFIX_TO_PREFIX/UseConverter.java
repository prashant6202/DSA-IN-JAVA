package DSA.STACK_1.Expresion5_INFIX_TO_PREFIX;

import java.util.Scanner;

public class UseConverter {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a valid infix exp:");
        String infix=kb.next();
        Converter obj=new Converter(infix);
        obj.toPreFix();
        System.out.println(obj);
    }
}
