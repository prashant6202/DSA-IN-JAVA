package DSA.STACK_1.Expresion5_INFIX_TO_PREFIX;

import java.util.Stack;

public class Converter {
    private String infix, prefix;

    public Converter(String infix) {
        this.infix = infix;
        prefix ="";
    }

// sara kam yha krenge
    public void toPreFix(){
        Stack<Character>st=new Stack<>();
        for (int i=infix.length()-1;i>=0;i--){
            char ch=infix.charAt(i);
            if(isOperand(ch)==true){
                prefix +=ch;
            }else {
                while (st.empty()==false){
                    if(precedence(ch)>=precedence(st.peek())){
                        break;
                    }else
                    prefix = prefix +st.pop();
                }
             st.push(ch);
                }
        }
        while (st.empty()==false){
            prefix +=st.pop();
        }

        StringBuilder sb=new StringBuilder(prefix);
        sb.reverse();
        prefix=sb.toString();
    }


    //chek krenge ki operator hai ya operand(alphabet(small,capital),0 to 9)
    public boolean isOperand(char ch){
        if(ch>=65&&ch<=90||ch>=97&&ch<=122||ch>=48&&ch<=57)
            return true;
            return false;
    }

    //precedence check krega op1=infix wala or op2= stack wala dono ko compaire krenge uske hisab
    //se stack me ya postfix me rkhenge.
    public int precedence(char op) {
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
        return "infix= " + infix + ",prefix= " + prefix;
    }
}
