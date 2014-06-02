package structure.queue;



/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 下午3:46
 * To change this template use File | Settings | File Templates.
 */
public class LinkQueue<T> implements Queue<T>{
    private Node head;
    private Node rear;
    private int  size;
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
            new NullPointerException("队列是空的!");
            tmp=null;
        }
        else{
            if(null==head.next)
                rear=null;
                tmp=head.data;
                head=head.next;
                size--;
        }
        return tmp;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int size() {
        return size;  //To change body of implemented methods use File | Settings | File Templates.
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
    public static void main(String[] args){
        LinkQueue<String> q=new LinkQueue<String>();
        q.add("a");
        q.add("b");
        q.add("c");
        q.add("d");
        q.add("e");
        q.add("f");
        q.add("g");
        System.out.println(q.size());
        while(!q.isEmpty()){
            String temp=q.remove();
           // System.out.println(temp);
            System.out.println(q.size());
        }
    }
}
