package algorithm.hidhlevelexam;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-19
 * Time: 上午10:44
 * To change this template use File | Settings | File Templates.
 */
public class StackGetMin {
    Stack<Integer> elements;
    Stack<Integer> minStack;
    public void push(int x){
        elements.push(x);
        if(minStack.empty()||x<=minStack.peek())
            minStack.push(x);
    }
    public boolean pop(){
        if(elements.empty()) return false;
        if(elements.peek()==minStack.peek())
            minStack.pop();
          elements.pop();
        return true;
    }
    public boolean getMin(int min){
        if(minStack.isEmpty()){
            return false;
        }else {
            min=minStack.peek();
            return true;
        }
    }
    public static void main(String[] args){
        StackGetMin stackGetMin=new StackGetMin();
        stackGetMin.push(2);
        stackGetMin.push(6);
        stackGetMin.push(4);
        stackGetMin.push(1);
        stackGetMin.push(5);
        int min=0;
        System.out.println(stackGetMin.getMin(min));
    }

}
