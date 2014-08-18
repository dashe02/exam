package algorithm.sort.productConsume;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-17
 * Time: 上午11:40
 * To change this template use File | Settings | File Templates.
 */
public class PublicResource {

      private int count=0;

      public synchronized void increase(){
             try{
                 if(count>0){
                     wait();
                 }
             }catch (Exception e){
                e.printStackTrace();
              }
             count++;
             System.out.println(count);
             notifyAll();
      }

      public synchronized void desc(){
                try{
                    if(count==0)
                    {
                        wait();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
               count--;
               System.out.println(count);
               notifyAll();
      }

}
