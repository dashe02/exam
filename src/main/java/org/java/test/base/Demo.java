package org.java.test.base;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-27
 * Time: 下午6:27
 * To change this template use File | Settings | File Templates.
 */
public class Demo {
    public static void main(String[] args){
           String s="hello";
           String t="hello";
           char c[]={'h','e','l','l','o'};
           System.out.print(s.equals(t));
           System.out.print(s.equals(c));
           System.out.print(s==t);
           System.out.print(t.equals(new String("hello")));

    }
}
