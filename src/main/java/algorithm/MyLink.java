package algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午6:24
 * To change this template use File | Settings | File Templates.
 */
public class MyLink<T> {

    class Node{
        T data;
        Node next;
    }

    private int size;
    private Node top;

    public boolean isEmpty(){
        return size==0;
    }
    public int length(){
        return size;
    }
    public T add(T data){
        Node node=new Node();
        top=node;
        return null;

    }


}
