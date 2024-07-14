package DSA.STACK_1.Expresion3_INFIX_TO_POSTFIX;

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
           if(isOperand(ch)==true){
               postfix=postfix+ch;
           }else {
              while (st.empty()==false){
                  boolean result=precedence(ch,st.peek());
                  if(result==true)
                      break;
                  postfix=postfix+st.pop();
              }
              st.push(ch);
           }

           }
        while (st.empty()==false){
            postfix=postfix+st.pop();
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
    public boolean precedence(char op1,char op2) {
        if (op2 == '$')
            return false;
        else if (op1 == '$')
            return true;
        else if (op2 == '%' || op2 == '/' || op2 == '*')
            return false;
        else if (op1 == '%' || op1 == '/' || op1 == '*')
            return true;
        else if (op2 == '+' || op2 == '-')
            return false;
        else
            return true;
    }


    //result print kane ke liye . alg se method bna skte the but result print krane ke liye
    //toString() is best.
    @Override
    public String toString() {
        return "infix= " + infix + ",postfix= " + postfix;
    }
}
