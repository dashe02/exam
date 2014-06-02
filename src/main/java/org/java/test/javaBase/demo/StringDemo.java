package org.java.test.javaBase.demo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-24
 * Time: 下午3:02
 * To change this template use File | Settings | File Templates.
 */
public class StringDemo {
    private static final String MESSAGE="taobao";

    public static void main(String[] args){
        String a="tao"+"bao";
        String b="tao";
        String c="bao";
        System.out.println(a==MESSAGE);
        System.out.println((b+c)==MESSAGE);
    }
}
