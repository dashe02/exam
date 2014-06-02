package org.java.test.javaBase.array;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 下午3:03
 * To change this template use File | Settings | File Templates.
 */
public interface IArray<T> {
    /*
    * 一个数组具有哪些行为
    * add一个元素
    * remove删除一个元素
    * 修改
    * 查找
    * 查找所有
    */
    void initArray();

    void initArray(int capacity);

    T find(int index);

    void add(int index,T data);

    void remove(int index);

    void addByRange(int fromIndex,int toIndex,T[] data);

    int length();

    boolean isEmpty();

    void clear();

    void checkRange(int index);



}
