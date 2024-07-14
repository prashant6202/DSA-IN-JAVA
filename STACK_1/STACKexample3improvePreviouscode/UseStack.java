package DSA.STACK_1.STACKexample3improvePreviouscode;

import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        Scanner kb=new Scanner(System.in);
        int choice;
        int number;
        do {
            System.out.println("Select an Opertations:");
            System.out.println("1.Push \n 2.Pop \n 3.Peek \n 4.Quit");
            choice=kb.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter number to Push:");
                    number=kb.nextInt();
                    try {
                        s.push(number);
                        System.out.println("Pushed: "+number);
                    }catch(StackException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    try {
                        number=s.pop();
                        System.out.println("Poped: "+number);
                    }catch(StackException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    try {
                        number=s.peek();
                        System.out.println("Top element is : "+number);
                    }catch(StackException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using this app");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice.Try again !");
            }
        }while (choice!=4);
    }

}
