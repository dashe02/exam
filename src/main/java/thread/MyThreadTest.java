package thread;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-20
 * Time: 下午11:30
 * To change this template use File | Settings | File Templates.
 */
class MyThreadX implements Runnable{

    public void run(){
        System.out.println("r1");
        System.out.println("r2");
    }
}
public class MyThreadTest {
    public static void main(String[] args) throws InterruptedException{
        Thread t=new Thread(new MyThreadX());
        t.start();
        System.out.println("m1");
        t.join();
        System.out.println("m2");
    }
}
