package algorithm.sort.queue;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-17
 * Time: 下午9:18
 * To change this template use File | Settings | File Templates.
 */
public class ArrayQueue<T> implements Queue<T>{

    private T[] data;

    private int size;

    private int front;

    private int rear;

    public ArrayQueue(){
        data=(T[])new Object[10];
        size=0;
        front=0;
        rear=0;
    }

    @Override
    public void add(T t) {
        if(isFull()){
            resize();
            front=0;
        }
        rear=(front+size)%data.length;
       // System.out.println(rear);
        data[rear]=t;
        size++;
    }
    public void resize(){
        T[] temp=(T[])new Object[2*data.length];
        System.arraycopy(data,0,temp,0,data.length);
        data=temp;
        temp=null;
    }
    @Override
    public T remove() {
        if(isEmpty()){
            throw new RuntimeException("队列为空!");
        }
        T tempData=data[front];
        data[front]=null;
        front=(front+1)%(data.length);
        size--;
        return tempData;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int size() {
        return size;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEmpty() {
        return size==0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T front() {
        if(isEmpty()){
            throw new RuntimeException("对列为空！");
        }
        return data[front];  //To change body of implemented methods use File | Settings | File Templates.
    }
    public boolean isFull(){
        return size==data.length;
    }
    public static void main(String[] args){
        ArrayQueue<String> queue=new ArrayQueue<String>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");
        if(!queue.isEmpty()){
            String temp=queue.remove();
            System.out.println(temp);
        }
    }
}
