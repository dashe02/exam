package cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 上午11:06
 * To change this template use File | Settings | File Templates.
 */
public class NonBlockingCounter {
      private AtomicInteger value;

      public int getValue(){
          return value.get();
      }

      public int increment(){
          int v;
          do{
             v =value.get();
          }while(!value.compareAndSet(v,v+1));
          return v+1;
      }



}
