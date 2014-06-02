package org.java.test.javaBase.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 上午10:40
 * To change this template use File | Settings | File Templates.
 */
public class ArrayStack<T> implements IStack<T>{
    private T[] t=(T[])new Object[16];

    private int size=0;

    @Override
    public boolean isEmpty() {
        return size==0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean push(T data) {
        if(size>t.length)
        {
            resize();
        }
        t[size++]=data;
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }
    public void resize(){
        T[] tmp=(T[])new Object[t.length*2];
        for(int i=0;i<t.length;i++){
            tmp[i]=t[i];
            t[i]=null;
        }
           t=tmp;
           tmp=null;
    }
    @Override
    public T pop() {
        if(size==0)
            return null;
        else{
            T tmp=t[size-1];
            t[size-1]=null;
            size--;
            return tmp;
        }
    }

    @Override
    public void clear() {
        for(int i=0;i<t.length;i++)
            t[i]=null;
            size=0;
    }

    @Override
    public int length() {
        return size;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int search(T t) {
       for(int i=0;i<this.t.length;i++){
           if (t.equals(this.t[i])){
               return i+1;
           }
       }
       return 0;
    }

    @Override
    public T peek() {
        if (size==0)
            return null;
        else{
            return t[size-1];
        }
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("ArrayStack:\n[\n");
        for(int i=size-1;i>=0;i--){
            sb.append(" "+t[i].toString());
            if(i!=size+1){
                sb.append("\n");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
