package condition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午4:36
 * To change this template use File | Settings | File Templates.
 */
/*
* 存款线程类
*/
class SaveThread extends Thread{
    private String name;
    private MyCount myCount;
    private int x;
    SaveThread(String name,MyCount myCount,int x){
        this.name=name;
        this.myCount=myCount;
        this.x=x;
    }
    public void run(){
        myCount.saving(x,name);
    }
}
//取款线程类
class DrawThread extends Thread{
    private String name;
    private MyCount myCount;
    private int x;
    DrawThread(String name,MyCount myCount,int x){
        this.name=name;
        this.myCount=myCount;
        this.x=x;
    }
    public void run(){
        myCount.drawing(x, name);
    }
}
class MyCount{
    private String oid; //账号
    private int cash; //账户金额
    private Lock lock=new ReentrantLock(); //账户锁
    private Condition _save=lock.newCondition();   //存款条件
    private Condition _draw=lock.newCondition();   //取款条件

    MyCount(String oid,int cash){
        this.oid=oid;
        this.cash=cash;
    }

    //存款
    public void saving(int x,String name){
        lock.lock();
        if(x>0){
            cash+=x;
            System.out.println(name+"存款"+x+",当前余额为"+cash);
        }
        _draw.signal();
        lock.unlock();
    }
   //取款
    public void drawing(int x,String name){
        lock.lock();
        try{
            if(cash-x<0){
                _draw.await();
            }else {
                cash-=x;
                System.out.println(name+"取款"+x+",当前余额为"+cash);
            }
            _save.signalAll();
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
public class ConditionTest {
        public static void main(String[] args){
          MyCount myCount=new MyCount("95599200901215522",10000);
          ExecutorService pool= Executors.newFixedThreadPool(2);
          Thread t1=new SaveThread("张三",myCount,2000);
          Thread t2=new SaveThread("李四",myCount,3600);
          Thread t3=new DrawThread("王五",myCount,2700);
          Thread t4=new SaveThread("老张",myCount,600);
          Thread t5=new DrawThread("老牛",myCount,1300);
          Thread t6=new DrawThread("胖子",myCount,800);
          pool.execute(t1);
          pool.execute(t2);
          pool.execute(t3);
          pool.execute(t4);
          pool.execute(t5);
          pool.execute(t6);
          pool.shutdown();
        }
}
