package algorithm.sort.productConsume;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-17
 * Time: 上午11:45
 * To change this template use File | Settings | File Templates.
 */
public class ConsumerThread implements Runnable{

        private PublicResource publicResource;

        ConsumerThread(PublicResource publicResource){
            this.publicResource=publicResource;
        }

        public void run(){
            for(int i=0;i<10;i++){
             publicResource.desc();
            }
        }

}
