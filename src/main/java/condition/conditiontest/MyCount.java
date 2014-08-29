package condition.conditiontest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午4:56
 * To change this template use File | Settings | File Templates.
 */
public class MyCount {
      private String oid;
      private int cash;
      private Lock lock=new ReentrantLock();
      private Condition _save=lock.newCondition();
      private Condition _draw=lock.newCondition();

      MyCount(String oid,int cash){
          this.oid=oid;
          this.cash=cash;
      }
      public void saving(int x,String name){
          lock.lock();
          if(x>0){
              cash+=x;
              System.out.println(name+"存了"+x+"余额为"+cash);
          }
          _draw.signalAll();
          lock.unlock();
      }
      public void drawing(int x,String name){
          lock.lock();
          try{
              if(cash-x<0){
                 _draw.await();
              }else {
                  cash-=x;
                  System.out.println(name+"取款"+x+"余额为"+cash);
              }
              _save.signalAll();
          }catch(Exception e){
              e.printStackTrace();
          }finally {
              lock.unlock();
          }
      }
}
