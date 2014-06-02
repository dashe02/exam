package org.java.test.javaBase.test;

import org.java.test.javaBase.test.LinkStack;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 上午11:36
 * To change this template use File | Settings | File Templates.
 */
public class LinkStackTest {
    public static void main(String[] args){
        LinkStack<String> linkStack=new LinkStack<String>();
        linkStack.push("1");
        linkStack.push("2");
        linkStack.push("3");
        linkStack.push("4");
        linkStack.push("5");
        linkStack.pop();
        linkStack.peek();
        linkStack.pop();
        System.out.println(linkStack.toString());
    }
}
