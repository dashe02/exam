package org.java.test.javaBase.stack;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 上午9:23
 * To change this template use File | Settings | File Templates.
 */
public interface IStack<T> {

     boolean isEmpty();

     void clear();

      T pop();

      boolean push(T data);

      int length();

      T peek();

      int search(T t);
}
