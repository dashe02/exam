package org.java.exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-1
 * Time: 上午9:33
 * To change this template use File | Settings | File Templates.
 */
public interface IStack<T> {

    int length();

    boolean push(T data);

    T pop();

    int search(T t);

    T peek();

    void clear();

    boolean isEmpty();

}
