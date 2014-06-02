package org.java.test.javaBase.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 上午10:57
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
        System.out.println(arrayStack.search("3"));
        System.out.println(arrayStack.toString());
    }
}
