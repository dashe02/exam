package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午2:45
 * To change this template use File | Settings | File Templates.
 */
public class QueueTest {
      public static void main(String[] args){
          Queue<String> q=new LinkedList<String>();
          q.offer("a");
          q.offer("b");
          q.offer("c");
          q.offer("d");
          q.offer("e");
          String str;
          while((str=q.poll())!=null){
              System.out.println(str);
          }
      }
}
