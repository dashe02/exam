package structure.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 下午4:16
 * To change this template use File | Settings | File Templates.
 */
public class LinkQueue<T> implements Queue<T> {
    private Node head;
    private Node rear;
    private int size;
    public LinkQueue(){
        head=null;
        rear=null;
        size=0;
    }
    class Node{
        T data;
        Node next;
        public Node(){

        }
        public Node(T t){
            this.data=t;
        }
    }
    @Override
    public void add(T t) {
       Node node=new Node();
        if(isEmpty())
            head=node;
        else
            rear.next=node;
        rear=node;
        size++;
    }

    @Override
    public T remove() {
        T tmp;
        if(isEmpty()){
            new NullPointerException("列表为空!");
            tmp=null;
        }else{
            if(null==head.next)
                rear=null;
            tmp=head.data;
            head=head.next;
            size--;
        }
        return tmp;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEmpty() {
        return head==null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T front() {
        if(head!=null)
        return head.data;  //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    @Override
    public int size() {
        return size;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
