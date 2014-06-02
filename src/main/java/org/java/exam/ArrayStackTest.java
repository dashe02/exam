package org.java.exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-1
 * Time: 上午9:55
 * To change this template use File | Settings | File Templates.
 */
public class ArrayStackTest {
    public static void main(String[] args){
        ArrayStack<String> arrayStack=new ArrayStack<String>();
        arrayStack.push("1");
        arrayStack.push("2");
        arrayStack.push("3");
        arrayStack.push("4");
        arrayStack.push("5");
        arrayStack.pop();
        arrayStack.peek();
        arrayStack.pop();
        System.out.println(arrayStack.toString());
    }
}
