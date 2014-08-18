package algorithm.sort.queue1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-17
 * Time: 下午9:55
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
        rear=(front+size)%(data.length);
        data[rear]=t;
        size++;
    }
    public void resize(){
        T[] tmp=(T[])new Object[data.length*2];
        System.arraycopy(data,0,tmp,0,data.length);
        data=tmp;
        tmp=null;
    }
    @Override
    public T remove() {
        if(isEmpty()){
            throw new RuntimeException("对列为空!");
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
    public boolean isFull() {
        return size==data.length;  //To change body of implemented methods use File | Settings | File Templates.
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
        q.add("a");
        q.add("b");
        q.add("c");
        q.add("d");
        q.add("e");
        if(!q.isEmpty()){
            String temp=q.remove();
            System.out.println(temp);
        }
    }
}
