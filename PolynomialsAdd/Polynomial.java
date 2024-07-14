package DSA.PolynomialsAdd;

import java.util.NoSuchElementException;

public class Polynomial {
    private Node head;
    public void addAtLast(int coeff,int exp){
        Node p=new Node(coeff,exp);
        if (head == null) {
            head=p;
            return;
        }
        Node temp=head;
        while (temp.getNext() != null) {
            temp=temp.getNext();
        }
        temp.setNext(p);
    }

    public void printList(){
        if (head == null) {
            System.out.println("List is empty");
            return;

        }
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.getCoeff()+"X"+temp.getExp()+"+");
            temp=temp.getNext();
        }
        System.out.println();
    }

    public void addPoly(Polynomial p1,Polynomial p2){
        if (p1.head == null && p2.head == null) {
            System.out.println("Addition not possible");
            return;
        }
        Node f=p1.head;
        Node s=p2.head;
        Node temp=null,p=null;
        while (f != null && s != null) {
            p=new Node();
            if (head == null) {
                head=p;
            }else {
                temp.setNext(p);
            }
            temp=p;
            if (f.getExp() < s.getExp()) {
                p.setCoeff(f.getCoeff());
                p.setExp(f.getExp());
                f=f.getNext();
            } else if (f.getExp() > s.getExp()) {
                p.setCoeff(s.getCoeff());
                p.setExp(s.getExp());
                s=s.getNext();
            }else {
                p.setCoeff(f.getCoeff()+s.getCoeff());
                p.setExp(f.getExp());
                f=f.getNext();
                s=s.getNext();
            }
        }
        Node q=null;
        if (f != null) {
            q=f;
        }else {
            q=s;
        }
        while (q != null) {
            p=new Node(q.getCoeff(),q.getExp());
            if (head == null) {
                head=p;
            }else {
                temp.setNext(p);
            }
            temp=p;
            q=q.getNext();
        }

    }

}
