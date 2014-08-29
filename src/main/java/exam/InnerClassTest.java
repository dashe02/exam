package exam;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-26
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
class OuterClass{
     private static int a=11;
        class staticInnerClass {
          public void start(){

         }
         public void end(){
             System.out.print(OuterClass.a);
         }
     }
    public void outerStart(){
        Queue<String>q=new PriorityQueue<String>();
    }
    public void outerEnd(){

    }

}
public class InnerClassTest {

}
