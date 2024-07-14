package DSA.STACK_1.Expresion6_INFIX_PARENTHESIZED_TO_POSTFIX;

import java.util.Stack;

public class Converter {
    private String infix,postfix;

    public Converter(String infix) {
        this.infix = infix;
        postfix="";
    }

// sara kam yha krenge
    public void toPostFix(){
        Stack<Character>st=new Stack<>();
        for (int i=0;i<=infix.length()-1;i++){
            char ch=infix.charAt(i);
            if(ch=='('){
                st.push(ch);
            } else if (ch==')') {
                while (st.peek()!='('){
                    postfix+=st.pop();
                }
                st.pop();
            }
            else if(isOperand(ch)==true){
                postfix+=ch;
            }else {
                while (st.empty()==false){
                    if(st.peek()=='(')
                        break;
                    if(precedence(ch)>precedence(st.peek())){    //change here only
                        break;
                    }else
                    postfix=postfix+st.pop();
                }
             st.push(ch);
                }
        }
        while (st.empty()==false){
            postfix+=st.pop();
        }
    }


    //chek krenge ki operator hai ya operand(alphabet(small,capital),0 to 9)
    public boolean isOperand(char ch){
        if(ch>=65&&ch<=90||ch>=97&&ch<=122||ch>=48&&ch<=57)
            return true;
            return false;
    }

    //precedence check krega op1=infix wala or op2= stack wala dono ko compaire krenge uske hisab
    //se stack me ya postfix me rkhenge.
    public int precedence(char op) {      //change here only
        if (op == '$')
            return 3;
        else if (op == '%' || op== '/' || op == '*')
            return 2;
         else if (op== '+' || op == '-')
            return 1;
        else
            return 0;
    }


    //result print kane ke liye . alg se method bna skte the but result print krane ke liye
    //toString() is best.
    @Override
    public String toString() {
        return "infix= " + infix + "  ,postfix= " + postfix;
    }
}
