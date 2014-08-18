package algorithm.sort.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-17
 * Time: 上午9:51
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionThread {
    public static void main(String[] args){
        try{
            CatchException.catchExceptionByUncaughtExceptionHandler();
            System.out.println("******************************************");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
   static class ExceptionRunnable implements Runnable{
          public void run(){
              throw new RuntimeException("Throw By Runnable");
          }
    }
   static class CatchException{
        public static void catchExceptionByCatch(){
            ExecutorService es= Executors.newCachedThreadPool();
            es.execute(new ExceptionRunnable());
        }
   public static void catchExceptionByUncaughtExceptionHandler(){
       Thread t=new Thread(new ExceptionRunnable());
       t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
           @Override
           public void uncaughtException(Thread t, Throwable e) {
               System.out.println("Exeption "+e.getMessage()+"was catched");
           }
       });
       t.start();
   }
    }
}
