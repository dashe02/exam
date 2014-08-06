package mypackage;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

import java.io.Serializable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-23
 * Time: 下午6:02
 * To change this template use File | Settings | File Templates.
 */
public  class ReadWriteLock {
   private int readingThreads=0;
   private int writingThreads=0;
   private int waitingThreads=0;
   private boolean preferWrite=true;
    //用于获取读锁
   public synchronized void readLock() throws InterruptedException{
        while(waitingThreads>0||(preferWrite&&writingThreads>0))
            this.wait();
            readingThreads++;
   }
    //释放读锁
    public synchronized void readUnlock(){
        readingThreads--;
        preferWrite=true;
        notifyAll();
    }
    //获取写锁
    public synchronized void writeLock() throws InterruptedException{
        waitingThreads++;
        try{
         while(readingThreads>0||writingThreads>0)
             this.wait();
        }finally {
            writingThreads--;
        }
            writingThreads++;
    }
    //释放写锁
     public synchronized void writeUnlock(){
         writingThreads--;
         preferWrite=false;
         notifyAll();
     }
    /*
    * 思考:
    * java的synchronized提供了最底层的物理锁,要在synchronized的基础上,实现自己的逻辑锁,就必须
    *仔细设计ReadWriteLock
    * 1.lock.readLock()为什么不放入try{}内？
    * 因为readLock()会抛出InterruptedException，导致readingThreads++不执行,而readUnlock()在finally{}中,导致
    *readingThreads一执行,从而使readingThread状态出错.wirteLock()也是类似的.
    * preferWrite有用吗？
    * A: 如果去掉preferWrite，线程安全不受影响。但是，如果读取线程很多，上一个线程还没有读取完，下一个线程又开始读了，就导致写入线程长时间无法获得writeLock；如果写入线程等待的很多，一个接一个写，也会导致读取线程长时间无法获得readLock。preferWrite的作用是让读/写交替执行，避免由于读线程繁忙导致写无法进行和由于写线程繁忙导致读无法进行。
    * Q: notifyAll()换成notify()行不行？
    * A: 不可以。由于preferWrite的存在，如果一个线程刚读取完毕，此时preferWrite=true，再notify()，若恰好唤醒的是一个读线程，则while(writingThreads>0 || (preferWrite && waitingThreads>0))可能为true导致该读线程继续等待，而等待写入的线程也处于wait()中，结果所有线程都处于wait()状态，谁也无法唤醒谁。因此，notifyAll()比notify()要来得安全。程序验证notify()带来的死锁：
    */





}
