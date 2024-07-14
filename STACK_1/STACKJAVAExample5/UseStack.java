package DSA.STACK_1.STACKJAVAExample5;

import java.util.*;
public class UseStack {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        while (st.empty()!=true){
            System.out.println(st.pop());
        }

    }
}
