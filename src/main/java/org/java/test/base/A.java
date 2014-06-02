package org.java.test.base;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-27
 * Time: 下午6:41
 * To change this template use File | Settings | File Templates.
 */
class B extends Object{
    static {
        System.out.println("Load B");
    }
    public B(){
        System.out.println("Create B");
    }
}
class C extends B{
    static {
        System.out.println("Load C");
    }
    public C(){
        System.out.println("Create C");
    }
}

public class A {
    public static void main(String[] args){
        new C();
    }
}
