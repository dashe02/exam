package optimisticLock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-22
 * Time: 下午11:04
 * To change this template use File | Settings | File Templates.
 *  简单实现乐观独占锁
 */
public class OptimisticExecusiveLock {

      private AtomicBoolean state=new AtomicBoolean(false);

      List<Thread> queue=new ArrayList<Thread>();    //阻塞队列

      public boolean lock(){
          if(!state.get()&&state.compareAndSet(false,true)){   //取锁成功不会阻塞,程序会继续执行
              return true;    //利用CAS
          }else {
              queue.add(Thread.currentThread());   //加入阻塞队列
              LockSupport.park();                 //阻塞线程
              return false;
          }
      }
    public boolean  unLock(){
        if(state.get()){
            queue.remove(Thread.currentThread()); //从队列里移除
            if(state.compareAndSet(true,false)){  //利用CAS
                if(!queue.isEmpty()){
                    LockSupport.unpark(queue.get(0));   //唤醒第一个等待线程
                }
                return true;
            }
            return false;
        }else{
            return false;
        }
    }



}
