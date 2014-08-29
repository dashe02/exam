package algorithm.exist.structure.queue;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-20
 * Time: 下午9:01
 * To change this template use File | Settings | File Templates.
 */
public class ArrayQueue<T> implements Queue<T>{

    private T[] data;

    private int front;

    private int rear;

    private int size;

    public ArrayQueue(){
        data=(T[])new Object[10];
        front=0;
        rear=0;
        size=0;
    }
    @Override
    public boolean isEmpty() {
        return size==0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isFull() {
        return size==data.length;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T remove() {
        if(isEmpty()){
            throw new RuntimeException("队列为空!");
        }
        T tempData=data[front];
        front=(front+1)%data.length;
        size--;
        return tempData;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void add(T t) {
        if(isFull()){
           resize();
           front=0;
        }
        rear=(front+size)%data.length;
        data[rear]=t;
        size++;
    }
    public void resize(){
       T[] temp=(T[])new Object[data.length*2];
       System.arraycopy(temp,0,data,0,data.length);
       data=temp;
       temp=null;
    }
    @Override
    public T front() {
        if(isEmpty()){
            throw new RuntimeException("队列为空!");
        }
        return data[front];  //To change body of implemented methods use File | Settings | File Templates.
    }
    public static void main(String[] args){
        ArrayQueue<String> q=new ArrayQueue<String>();
        q.add("f");
        q.add("a");
        q.add("d");
        q.add("b");
        q.add("c");
        while(!q.isEmpty()){
            String temp=q.remove();
            System.out.println(temp);
        }
    }
}
