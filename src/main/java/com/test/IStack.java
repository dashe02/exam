package com.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 上午10:22
 * To change this template use File | Settings | File Templates.
 */
public interface IStack<T> {

    int length();

    boolean push(T data);

    T pop();

    int Search(T t);

    void clear();

    boolean isEmpty();

    T peek();
}
