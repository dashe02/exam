package org.java.test.javaBase.demo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-24
 * Time: 下午3:14
 * To change this template use File | Settings | File Templates.
 */
class Counter{
    private static int count=0;
    public int increment(){
        return count++;
    }
    public int anotherIncrement(){
        return ++count;
    }
}
public class Spike {
    public static void main(String[] args){
           Counter a=new Counter();
           System.out.println(a.increment());
           System.out.println(a.anotherIncrement());
           Counter b=new Counter();
           System.out.println(b.increment());
    }
}
