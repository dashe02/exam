package org.java.test.javaBase.stack;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 上午9:55
 * To change this template use File | Settings | File Templates.
 */
public class ArrayStackTest {
    public static void main(String[] args){
        ArrayStack<String> arrayStack=new ArrayStack<String>();
        arrayStack.push("C语言");
        arrayStack.push("C++");
        arrayStack.push("JAVA");
        arrayStack.push("数据结构");
        arrayStack.pop();
        arrayStack.peek();
        arrayStack.pop();
        System.out.println(arrayStack.toString());

    }
}
