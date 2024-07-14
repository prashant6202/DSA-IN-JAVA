package DSA.PolynomialsAdd;

public class UsePolynomial {
    public static void main(String[] args) {
        Polynomial first=new Polynomial();
        Polynomial sec=new Polynomial();
        Polynomial third=new Polynomial();
        first.addAtLast(2,1);
        first.addAtLast(4,2);
        first.addAtLast(3,5);
        first.addAtLast(2,6);

        sec.addAtLast(1,1);
        sec.addAtLast(5,3);
        sec.addAtLast(3,4);
        sec.addAtLast(4,5);

        third.addPoly(first,sec);
        first.printList();
        sec.printList();
        System.out.println("Their sum is ");
        third.printList();
    }
}
