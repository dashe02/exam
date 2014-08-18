package algorithm.sort.stack;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 下午12:00
 * To change this template use File | Settings | File Templates.
 */
public class LinkStack<T> implements IStack<T> {

    class Node{
        T data;
        Node next;
    }
    private Node top;

    private int size;

    public LinkStack(){
        top=null;
        size=0;
    }
    @Override
    public int length() {
        return size;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean push(T data) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T peek() {
        return top.data;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T pop() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEmpty() {
        return size==0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int search(T t) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
