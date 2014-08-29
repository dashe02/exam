package atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午6:34
 * To change this template use File | Settings | File Templates.
 */
class MyRunnable1 implements Runnable{
     private static AtomicInteger aLong=new AtomicInteger(10000);
     private String name;
     private int x;
     private Lock lock;
    public MyRunnable1(String name,int x,Lock lock){
        this.name=name;
        this.x=x;
        this.lock=lock;
    }
     public void run(){
         lock.lock();
         System.out.println(name + "执行了" + x + ",余额为:" + aLong.addAndGet(x));
         lock.unlock();
     }
}
public class AutomicTest {
     public static void main(String[] args){
         ExecutorService pool= Executors.newFixedThreadPool(2);
         Lock lock=new ReentrantLock(false);
         MyRunnable1 t1=new MyRunnable1("张三",2000,lock);
         MyRunnable1 t2=new MyRunnable1("李四",3600,lock);
         MyRunnable1 t3=new MyRunnable1("王五",1000,lock);
         MyRunnable1 t4=new MyRunnable1("老张",800,lock);
         MyRunnable1 t5=new MyRunnable1("老牛",1300,lock);
         MyRunnable1 t6=new MyRunnable1("胖子",700,lock);
         pool.execute(t1);
         pool.execute(t2);
         pool.execute(t3);
         pool.execute(t4);
         pool.execute(t5);
         pool.execute(t6);
         pool.shutdown();
     }
}
