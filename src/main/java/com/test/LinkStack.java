package com.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 上午10:54
 * To change this template use File | Settings | File Templates.
 */
public class LinkStack<T> implements IStack<T>{

     class Node{
          private Node pre;
          private T data;
    }
    private Node top;
    private int size;

    public LinkStack(){
        this.top=null;
        this.size=0;
    }
    @Override
    public int length() {
        return size;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean push(T data) {
        Node node=new Node();
        node.data=data;
        node.pre=top;
        top=node;
        size++;
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T pop() {
        if(top!=null){
            T t=top.data;
            top=top.pre;
            size--;
            return t;
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int Search(T t) {
        int count=0;
        for(Node node=top;node!=null;node=node.pre){
               count++;
               if(t.equals(node.data)){
                   return size-count;
               }
        }
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clear() {
        //To change body of implemented methods use File | Settings | File Templates.
        top=null;
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T peek() {
        return top.data;  //To change body of implemented methods use File | Settings | File Templates.
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("LinkedList:\n[\n");
        int count=0;
        for(Node node=top;node!=null;node=node.pre){
            count++;
            sb.append(" "+node.data.toString());
            if(count!=size+1){
                sb.append("\n");
            }
        }
        sb.append("]");
        System.out.println(count);
       return sb.toString();
    }
}
