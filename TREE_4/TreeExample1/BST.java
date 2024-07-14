package DSA.TREE_4.TreeExample1;

import java.util.NoSuchElementException;
import java.util.Stack;

public class BST {
    private Node root;
    public void append(int x) {
        Node p = new Node(x);
        if (root == null) {
            root = p;
            return;
        }
        Node temp = root, prev = null;
        while (temp != null) {
            prev = temp;
            if (temp.getData() > x) {
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
        if (prev.getData() > x) {
            prev.setLeft(p);
        }else {
            prev.setRight(p);
        }
    }

    // Tree traversal in 3 order--->  1.Pre-Order ,2.In-Order ,3.post-Order

    //1.Pre-Order traversal
    public void preorder(){
        if (root == null) {
            System.out.println("Empty Tree.");
            return;
        }
        Node temp=root;
        Stack<Node>st=new Stack<>();
        st.push(temp);
        while (!st.empty()){
            temp=st.pop();
            while (temp != null) {
                System.out.println(temp.getData());
                if (temp.getRight() != null) {
                    st.push(temp.getRight());
                }
                temp=temp.getLeft();
            }
        }
    }




    public void preorder2(){
        if (root == null) {
            System.out.println("Tree empty");
            return;
        }
        Stack<Node>st=new Stack<>();
        Node temp=root;
        while (true) {
            System.out.println(temp.getData());
            if (temp.getRight() != null) {
                st.push(temp.getRight());
            }
                temp = temp.getLeft();
                if (temp == null) {
                    if (st.empty()) {
                        break;
                    }
                    temp = st.pop();
                }
        }
    }

    // 2.In-Order traversal
    public void inOrder(){
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }
        Stack<Node>st=new Stack<>();
        Node temp=root;
        while (temp != null || st.empty() == false) {
            while (temp != null) {
                st.push(temp);
                temp=temp.getLeft();
            }
            temp=st.pop();
            System.out.println(temp.getData());
           temp=temp.getRight();
        }
    }

    // 3.Post-Order traversal
    public void postOrder(){
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }

        Stack<Node>st=new Stack<>();
        Node temp=root;
        while (temp != null || st.empty() == false) {
            while (temp != null) {
                st.push(temp);
                if (temp.getRight() != null) {
                    temp.getRight().setFlage(-1);
                    st.push(temp.getRight());
                }
                temp=temp.getLeft();
            }
            temp=st.pop();
            if (temp.getFlage() == 0) {
                System.out.println(temp.getData());
                temp=null;
            }else {
                temp.setFlage(0);
            }
        }
    }


    // 4.delete node in the TREE

    public boolean deleteNode(int x) {
        if (root == null) {
            throw new NoSuchElementException("Tree is empty");
        }
        Node[] arr = searchNode(x);
        if (arr == null) {
            return false;
        }
        Node parr=arr[0];
        Node child=arr[1];
        Node succ;
        //sift kiye hai abhi bs ye 2 child wala case hai
        if (child.getLeft()!=null && child.getRight()!=null) {
            succ=child.getRight();
            parr=child;
            while (succ.getLeft() != null) {
                parr=succ;
                succ=succ.getLeft();
            }
            child.setData(succ.getData());
            child=succ;
        }
        //yha se delete krna suru krenge  apn 0 child wala pehle lete hai
        if (child.getLeft() == null && child.getRight() == null) {
            if (parr == null) {
                root=null;
            }
            else if (child==parr.getLeft() ) {
               parr.setLeft(null);
            }else{
                parr.setRight(null);
            }
        }
        //one child wala delete krenge
        else if (child.getLeft() != null && child.getRight() == null) {
           if (parr==null){
               root=child.getLeft();
           }
            else if (child==parr.getLeft() ) {
                parr.setLeft(child.getLeft());
            }else{
                parr.setRight(child.getLeft());
            }
        }else if (child.getLeft() == null && child.getRight() != null) {
            if (parr == null) {
                root=child.getRight();
            }
            else if (child==parr.getLeft() ) {
                parr.setLeft(child.getRight());
            }else{
                parr.setRight(child.getRight());
            }
        }
        return true;
    }


    public Node[] searchNode(int x){
        Node[]arr=new Node[2];
        Node par=null,child=root;
        while (child!=null) {
            if (child.getData()==x){
            arr[0]=par;
            arr[1]=child;
            return arr;
        }
            par=child;
            if (child.getData() > x)
                child=child.getLeft();
            else
                child=child.getRight();
        }
        return null;
    }

}
