package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午3:19
 * To change this template use File | Settings | File Templates.
 */
public class BlockingQueue<T> {
         private Queue<T> queue=new LinkedList<T>();
         private int limit=10;

         public BlockingQueue(int limit){
             this.limit=limit;
         }

         public synchronized void enqueue(Object item) throws Exception{
            while(this.queue.size()==this.limit){
                wait();
            }
            if(this.queue.size()==0){
                notifyAll();
            }
             this.queue.add((T)item);
         }
         public synchronized Object dequeue() throws Exception{
               while(this.queue.size()==0){
                   wait();
               }
               if(this.queue.size()==this.limit){
                   notifyAll();
               }
               return this.queue.remove(0);
         }
}
