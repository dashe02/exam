package org.java.exam.calculate;

import org.java.exam.ArrayStack;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-1
 * Time: 下午2:26
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {
    private Stack<String> postfixStack=new Stack<String>(); //后缀式栈
    private Stack<Character> opStack=new Stack<Character>(); //运算符栈
    private int[] operatePriority=new int[]{0,3,2,1,-1,1,0,2};     //运用运算符ASCII码-40做索引的运算符优先
     /*
     按照给定的表达式计算
     要计算的表达式例如:5+12*(3+5)/7
      */
     public  double calculate(String expression){
           Stack<String> resultStack=new Stack<String>();
           prepare(expression);
           Collections.reverse(postfixStack);   //将后缀式栈反转
           String firstValue,secondValue,currentValue;   //参与计算的第一个值，第二个值和算术运算符
          while(!postfixStack.isEmpty()){
               currentValue=postfixStack.pop();
               if(!isOperator(currentValue.charAt(0))){
                   resultStack.push(currentValue);
               }else{
                   secondValue=resultStack.pop();
                   firstValue=resultStack.pop();
                   String tempResult=calculate(firstValue,secondValue,currentValue.charAt(0));
                   resultStack.push(tempResult);
               }
          }
         return Double.valueOf(resultStack.pop());
     }
    /*
    数据准备阶段将表达式转换为后缀式栈
     */
     public void prepare(String expression){
           opStack.push(','); //运算符放入栈底元素逗号,此符号优先级最低
           char[] arr=expression.toCharArray();
           int currentIndex=0;   //当前字符的位置
           int count=0;          //上次算数运算符到本次算数运算符的字符的长度便于或者之间的数值
           char currentOp,peekOp;   //当前操作符和栈顶操作符
           for(int i=0;i<arr.length;i++){
                currentOp=arr[i];
               if(isOperator(currentOp)){  //如果当前字符是运算符
                   if(count>0){
                       postfixStack.push(new String(arr,currentIndex,count));  //取两个运算符之间的数字
                   }
                   peekOp=opStack.peek();
                   if(currentOp==')'){    //遇到反括号则将运算栈中的与元素移除到后缀式栈中直到遇到左括号
                       while(opStack.peek()!='('){
                           postfixStack.push(String.valueOf(opStack.pop()));
                       }
                       opStack.pop();
                   }else{
                       while(currentOp!='('&&peekOp!=','&&compare(currentOp,peekOp)){
                           postfixStack.push(String.valueOf(opStack.pop()));
                           peekOp=opStack.peek();
                       }
                       opStack.push(currentOp);
                   }
                   count=0;
                   currentIndex=i+1;
               }else{
                   count++;
               }
           }
           if(count>1||(count==1&&!isOperator(arr[currentIndex]))){  //最后一个字符不是括号或者其他运算符的则加入后缀式栈中
               postfixStack.push(new String(arr,currentIndex,count));
           }
           while(opStack.peek()!=','){
               postfixStack.push(String.valueOf(opStack.pop()));   //将操作符栈中的剩余的元素添加到后缀表达式栈中
           }
     }
     /*
       判断是否为算术符号
      */
      public boolean isOperator(char c){
        return c=='+'||c=='-'||c=='*'||c=='/'||c=='('||c==')';
      }
     /*
     利用ASCII码-40做下标去算术符号优先级
      */
    public boolean compare(char cur,char peek){  //如果是peek优先级高于cur，返回true,默认都是peek优先级要低
         boolean result=false;
        if(operatePriority[(peek)-40]>=operatePriority[(cur)-40]){
            result=true;
        }
        return result;
    }
    /*
    按照给定的算术运算符做计算
     */
    private String calculate(String firstValue,String secondValue,char currentOp){
        String result="";
        switch(currentOp){
            case '+':
                result=String.valueOf(ArithHelper.add(firstValue,secondValue));
                break;
            case '-':
                result=String.valueOf(ArithHelper.sub(firstValue,secondValue));
                break;
            case '*':
                result=String.valueOf(ArithHelper.mul(firstValue,secondValue));
                break;
            case '/':
                result=String.valueOf(ArithHelper.div(firstValue,secondValue));
                break;
        }
        return result;
    }
   public static void main(String[] args){
       System.out.println(5+12*(3+5)/7.0);
       Calculator cal=new Calculator();
       String s="5+12*(3+5)/7";
       double result=cal.calculate(s);
       System.out.println(result);
   }
}