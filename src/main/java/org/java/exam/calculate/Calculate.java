package org.java.exam.calculate;



import org.java.exam.ArrayStack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-1
 * Time: 上午10:44
 * To change this template use File | Settings | File Templates.
 */
public class Calculate {
    public String transferInfixToPostfix(String str){
        //将中缀表达式转换为后缀表达式
        StringBuilder sb=new StringBuilder();
        ArrayStack<Character> stack=new ArrayStack<Character>();
        //char c1=str.charAt(5);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                 char s=str.charAt(i);
                 sb.append(str.charAt(i));
            }
            if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }
            if(stack.peek()!=null){
            if(str.charAt(i)==')'||priority(str.charAt(i))<priority(stack.peek())){
                char c=stack.peek();
                sb.append(c);
                int x=stack.search('(');
                for(int j=stack.length();j>=x;j--){
                    stack.pop();
                }

            }
            }
            //判断与栈顶元素的优先级
        }

        return sb.toString();
    }
    public void calculateResult(String PostfixExpression){
        //根据转换的后缀表达式计算结果



    }
    public boolean filter(String str){
        boolean flag=false;
        String regex="[0-9]";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(str);
        while(m.find()){
           flag=true;
        }
        return flag;
    }
    public int priority(char c){
        int flag=0;
        switch(c){
            case '+':
                flag=1;
                break;
            case '-':
                flag=1;
                break;
            case '*':
                flag=2;
                break;
            case '/':
                flag=2;
                break;
        }
        return flag;
    }
    public static void main(String[] args){
        Calculate calculate=new Calculate();
        String str="9+(3-1)*3+8/2";
        System.out.println(calculate.transferInfixToPostfix(str));
    }
}
