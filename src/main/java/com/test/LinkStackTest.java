package com.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 上午11:17
 * To change this template use File | Settings | File Templates.
 */
public class LinkStackTest {
    public static void main(String[] args){
        LinkStack<String> linkStack=new LinkStack<String>();
        linkStack.push("计算机");
        linkStack.push("C语言");
        linkStack.push("C");
        linkStack.push("Java");
        linkStack.push("数学");
        linkStack.pop();
        linkStack.peek();
        linkStack.pop();
        System.out.println(linkStack.toString());
    }
}
