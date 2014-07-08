package base;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 上午11:29
 * To change this template use File | Settings | File Templates.
 */
public class Test6 {
    public static void qD(String s){
       int topOfStack=-1;
       boolean result=true;
       Stack<Character> stack=new Stack<Character>();
       for(int i=0;i<s.length();i++){
         switch(s.charAt(i)){
             case '{':
             case '[':
             case '(':
             stack.push(s.charAt(i));
             ++topOfStack;
             break;
             default:
             if(topOfStack==-1){
              result=false;
              break;
             }else{
             char top=stack.pop();
             topOfStack--;
             if(s.charAt(i)==')'&&top=='('||s.charAt(i)==']'&&top=='['||s.charAt(i)=='}'&&top=='{'){
                result=false;
             }
              break;
             }
         }
       }
        if(topOfStack>-1){
         System.out.println("false");
        }else if(result){
            System.out.println("true");
        }else if(!result){
            System.out.println("false");
        }
    }
    public static void main(String[] args){
        String s="dfa(sdf)df[dfds(dfd)]";
        qD(s);
    }
}
