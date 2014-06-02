package org.java.test.javaBase.array;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 下午3:11
 * To change this template use File | Settings | File Templates.
 */
public class ArrayImpl<T>  implements IArray<T>{
    private T[] t=null;
    private int size=0;
    @Override
    public void initArray() {
        t=(T[])new Object[10];
        size=t.length;
    }

    @Override
    public void initArray(int capacity) {
        t=(T[])new Object[capacity];
        size=t.length;
    }

    @Override
    public T find(int index) {
        checkRange(index);
        for(int i=0;i<size;i++){
            if(i==index){
                  return t[i];
            }
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void add(int index, T data) {
    checkRange(index);
    size++;
    T oldValue=t[index];
    t[index]=data;
    t[index+1]=oldValue;
    }

    @Override
    public void remove(int index) {
        //To change body of implemented methods use File | Settings | File Templates.
       checkRange(index);
       if(index==t.length-1){
           size--;
       }else{
           T o=t[index+1];
           size--;
           t[index]=o;
       }
    }
    @Override
    public void addByRange(int fromIndex, int toIndex, T[] data) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int length() {
        return t.length;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEmpty() {
        return t.length==0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clear() {
        //To change body of implemented methods use File | Settings | File Templates.
        for(int i=0;i<t.length;i++)
            t[i]=null;
    }

    @Override
    public void checkRange(int index) {
        if(index>size||index<0)
            throw new IndexOutOfBoundsException();
    }
}
