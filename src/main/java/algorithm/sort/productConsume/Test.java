package algorithm.sort.productConsume;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-17
 * Time: 上午11:50
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        PublicResource publicResource=new PublicResource();
        Thread productThread=new Thread(new ProductThread(publicResource));
        Thread consumerThread=new Thread(new ConsumerThread(publicResource));
        productThread.start();
        consumerThread.start();
    }
}
