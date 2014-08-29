package atomic;

import thread.MyThread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午6:12
 * To change this template use File | Settings | File Templates.
 */
class MyRunnable implements Runnable{
    private static AtomicLong aLong=new AtomicLong(10000);
    private String name;
    private int x;
    private Lock lock;

    public MyRunnable(String name,int x,Lock lock){
        this.name=name;
        this.x=x;
        this.lock=lock;
    }
    public void run(){
      lock.lock();
      System.out.println(name + "执行了" + x + ",当前余额:" + aLong.addAndGet(x));
      lock.unlock();
    }

}
public class Test {
    public static void main(String[] args){
        ExecutorService pool= Executors.newFixedThreadPool(2);
        Lock lock=new ReentrantLock(false);
        Runnable t1=new MyRunnable("张三",2000,lock);
        Runnable t2=new MyRunnable("李四",3600,lock);
        Runnable t3=new MyRunnable("王五",2700,lock);
        Runnable t4=new MyRunnable("老张",600,lock);
        Runnable t5=new MyRunnable("老牛",1300,lock);
        Runnable t6=new MyRunnable("胖子",800,lock);
        //执行各个线程
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        pool.execute(t6);
        pool.shutdown();
    }
}
