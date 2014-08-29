package thread;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-20
 * Time: 下午11:18
 * To change this template use File | Settings | File Templates.
 */
public class MyThread2 implements Runnable{
         public static void main(String[] args) throws InterruptedException{
             Thread t=new Thread(new MyThread2());
             t.start();
             System.out.println("m1");
             t.join();
             System.out.println("m2");
         }
        public void run(){
            System.out.println("r1");
            System.out.println("r2");
        }
}
