package org.java.test.javaBase.queue;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 下午4:56
 * To change this template use File | Settings | File Templates.
 */
public interface Queue<T> {

    void add(T t);

    int size();

    T remove();

    boolean isEmpty();
    //返回对头元素
    T front();



}
