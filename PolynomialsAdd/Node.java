package DSA.PolynomialsAdd;

public class Node {
    private int coeff;
    private int exp;
    private Node next;

    public Node(){}
    public Node(int coeff, int exp) {
        this.coeff = coeff;
        this.exp = exp;
    }

    public int getCoeff() {
        return coeff;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
