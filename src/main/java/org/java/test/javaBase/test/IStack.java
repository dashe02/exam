package org.java.test.javaBase.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 上午10:07
 * To change this template use File | Settings | File Templates.
 */
public interface IStack<T> {

   boolean isEmpty();

   boolean push(T data);

   T pop();

   void clear();

   int length();

   int search(T t);

   T peek();

}
