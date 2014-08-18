package algorithm.sort.productConsume;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-17
 * Time: 上午11:42
 * To change this template use File | Settings | File Templates.
 */
public class ProductThread implements Runnable{

      private PublicResource publicResource;

      ProductThread(PublicResource publicResource){
          this.publicResource=publicResource;
      }
      public void run(){
          for(int i=0;i<10;i++){
         publicResource.increase();
          }
      }
}
