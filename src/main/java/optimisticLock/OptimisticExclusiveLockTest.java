package optimisticLock;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-22
 * Time: 下午11:16
 * To change this template use File | Settings | File Templates.
 */
public class OptimisticExclusiveLockTest {
    public static OptimisticExecusiveLock lock=new OptimisticExecusiveLock();     //独占锁

    public static volatile int  i=0;                                             //保证可见

    public class Task implements Runnable{

        public void run(){
            while(true){
                try{
                    lock.lock();    //加锁
                    i+=2;
                    System.out.println("thread name" + Thread.currentThread().getName() + "i=" + i);
                }finally {
                    lock.unLock();  //释放锁
                    try{
                      Thread.currentThread().sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public void runTask(){
        for(int i=0;i<100;i++){
            Thread t=new Thread(new Task(),"thread"+i);
            t.start();
        }
    }
    public static void main(String[] args){
        OptimisticExclusiveLockTest test=new OptimisticExclusiveLockTest();
        test.runTask();
    }
}
