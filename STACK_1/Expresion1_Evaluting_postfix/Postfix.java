package DSA.STACK_1.Expresion1_Evaluting_postfix;
import java.util.Stack;

public class Postfix {
    private String postfix;
    public Postfix(String postfix) {

        this.postfix = postfix;
    }
    public float evaluate(){
        Stack<Float> st=new Stack<>();
        for (int i=0;i<postfix.length();i++){
            char ch=postfix.charAt(i);
            if(isOperand(ch)==true){
                st.push((float)ch-48);
            }else {
                float op2=st.pop();
                float op1=st.pop();
                float result= calculate(op1,op2,ch);
                st.push(result);
            }
        }
        return st.pop();

    }

    public boolean isOperand(char ch){
        if(ch>=48 &&ch<=57)
            return true;
        return false;
    }

    public float calculate(float op1,float op2, char op){
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
