package DSA.STACK_1.Expresion2_Evaluting_prefix;

import java.util.Stack;

public class Prefix {
    private String prefix;

    public Prefix(String prefix) {
        this.prefix = prefix;
    }

    //sara kam evaluate me krenge
    public float evaluate(){
        Stack<Float>st=new Stack<>();
        for(int i=prefix.length()-1;i>=0;i--){
            char ch=prefix.charAt(i);
            if(isOperand(ch)==true){
                st.push((float)ch-48);
            }else {
                float op1=st.pop();
                float op2=st.pop();
                float result=calculate(op1,op2,ch);
               st.push(result);
            }
        }
        return st.pop();
    }

    //check krenge jo prefix aaya hai oo operator hai ya operand
    public boolean isOperand(char ch){
        if(ch>=48&&ch<=57)
          return true;
        return false;
    }

    //yha sara airthmatic operation krenge
    public float calculate(float op1,float op2,char op){
        switch (op){
            case '+':
                return op1+op2;
            case '-':
                return op1-op2;
            case '*':
                return op1*op2;
            case '/':
                return op1/op2;
            case '%':
                return op1%op2;
            case '$':
                return (float)Math.pow(op1,op2);
            default:
                return 0.0f;
        }
    }
}
