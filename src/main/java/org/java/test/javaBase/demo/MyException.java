package org.java.test.javaBase.demo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-24
 * Time: 下午6:49
 * To change this template use File | Settings | File Templates.
 */
public class MyException extends RuntimeException{

     public MyException(){
       super();
       System.out.println("表达式有误!");
     }
}
