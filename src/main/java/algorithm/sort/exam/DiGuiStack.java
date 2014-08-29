package algorithm.sort.exam;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-19
 * Time: 下午7:13
 * To change this template use File | Settings | File Templates.
 */
public class DiGuiStack {
     public static void insertStackBottom(Stack<Integer> nStack,int n){
         if(nStack.empty())
             nStack.push(n);
         else {
            int ntop=nStack.peek();
             nStack.pop();
             insertStackBottom(nStack, n);
             nStack.push(ntop);
         }
     }
    //递归颠倒一个栈
    public static void reverseStack(Stack<Integer> nStack){
        if(nStack.empty())
            return;
        int ntop=nStack.peek();
        nStack.pop();
        reverseStack(nStack);
        insertStackBottom(nStack,ntop);
    }
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        reverseStack(stack);
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
