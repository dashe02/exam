package org.java.exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-1
 * Time: 上午9:36
 * To change this template use File | Settings | File Templates.
 */
public class ArrayStack<T> implements IStack<T>{
    private T[] t=(T[])new Object[16];
    private int size=0;
    @Override
    public int length() {
          return size;
    }

    @Override
    public boolean push(T data) {
        if(size>=t.length)
        {
            resize();
        }
        t[size++]=data;
        return true;
    }
    public void resize(){
        T[] temp=(T[]) new Object[t.length*2];
        for(int i=0;i<t.length;i++){
            temp[i]=t[i];
            t[i]=null;
        }
        t=temp;
        temp=null;
    }
    @Override
    public T pop() {
        if(size==0)
            return null;
        else{
            T temp=t[size-1];
            t[size-1]=null;
            size--;
            return temp;
        }
    }

    @Override
    public int search(T t) {
        for(int i=0;i<size;i++){
            if(t.equals(this.t[i])){
                return i+1;
            }
        }
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T peek() {
        if(size==0)
            return null;
        else{
            return t[size-1];
        }
    }

    @Override
    public void clear() {
    for(int i=0;i<t.length;i++)
        t[i]=null;
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;  //To change body of implemented methods use File | Settings | File Templates.
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("ArrayList:\n[\n");
        for(int i=size-1;i>=0;i--){
            sb.append(" "+t[i].toString()+"\n");
            if(i!=size+1){
                sb.append("\n");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
