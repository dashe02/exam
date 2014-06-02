package com.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 上午10:50
 * To change this template use File | Settings | File Templates.
 */
public class ArrayStackTest {
    public static void main(String[] args){
        ArrayStack<String> arrayStack=new ArrayStack<String>();
        arrayStack.push("计算机");
        arrayStack.push("C语言");
        arrayStack.push("C");
        arrayStack.push("Java");
        arrayStack.push("数学");
        arrayStack.pop();
        arrayStack.peek();
        arrayStack.pop();
        System.out.println(arrayStack.toString());
    }
}
