package algorithm.threadpool;



import java.util.Date;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-22
 * Time: 下午4:09
 * To change this template use File | Settings | File Templates.
 */
public class ThreadPool {
      private static ThreadPool instance=ThreadPool.getInstance();

      private static boolean debug=true;

      public static final int SYSTEM_BUSY_TASK_COUNT=150;
      //默认池中线程数
      public static int worker_num=5;
       //已经处理的任务数
      private static int taskCounter=0;

      public static boolean  systemIsBusy=false;

      private static List<Task> taskQueue= Collections.synchronizedList(new LinkedList<Task>());

      //池中的所有线程
    public PoolWorker[] workers;

    private ThreadPool(){
        workers=new PoolWorker[5];
        for(int i=0;i<workers.length;i++){
            workers[i]=new PoolWorker(i);
        }
    }
     private ThreadPool(int pool_worker_num){
         worker_num=pool_worker_num;
         workers=new PoolWorker[worker_num];
         for(int i=0;i<workers.length;i++){
             workers[i]=new PoolWorker(i);
         }
     }
      public static synchronized ThreadPool getInstance(){
          if(instance==null){
              return new ThreadPool();
          }
          return instance;
      }
      //增加新的任务
      //每增加一个新任务,都要唤醒任务队列
      public void addTask(Task newTask){
          synchronized (taskQueue){
              newTask.setTaskId(++taskCounter);
              newTask.setSubmitTime(new Date());
              taskQueue.add(newTask);
              taskQueue.notifyAll();
          }
      }
     //批量增加新任务
     public void batchAddTask(Task[] tasks){
         if(tasks==null||tasks.length==0){
             return;
         }
         synchronized (taskQueue){
             for(int i=0;i<tasks.length;i++){
                 if(tasks[i]==null){
                     continue;
                 }
                 tasks[i].setTaskId(++taskCounter);
                 tasks[i].setSubmitTime(new Date());
                 taskQueue.add(tasks[i]);
             }
             //唤醒队列,开始执行
             taskQueue.notifyAll();
         }
         for(int i=0;i<tasks.length;i++){
             if(tasks[i]==null){
                 continue;
             }
         }
     }
      //线程池信息
      public String getInfo(){
          StringBuilder sb=new StringBuilder();
          sb.append("\nTask Queue Size:"+taskQueue.size());
          for(int i=0;i<workers.length;i++){
              sb.append("\n Worker"+i+"is"+((workers[i].isWaiting())?"Waiting":"Running"));
          }
           return sb.toString();
      }
      //销毁线程池
      public synchronized void destory(){
          for(int i=0;i<worker_num;i++){
              workers[i].stopWorker();
              workers[i]=null;
          }
          taskQueue.clear();
      }
    //池中工作线程
      private class PoolWorker extends Thread{
        private int index=-1;
        private boolean isRunning=true;
        private boolean isWaiting=true;
        public PoolWorker(int index){
            this.index=index;
            start();
        }
        public void stopWorker(){
            this.isRunning=false;
        }

        public boolean isWaiting(){
            return this.isWaiting;
        }
        //循环执行任务
        public void run(){
         while (isRunning){
             Task r=null;
             synchronized (taskQueue){
              while (taskQueue.isEmpty()){
                  try{
                      taskQueue.wait(20);
                  }catch(InterruptedException e){
                      e.printStackTrace();
                  }
              }
                 r=(Task)taskQueue.remove(0);
             }
             if(r!=null){
                 isWaiting=false;
                 try{
                     if(debug){
                         r.setBeginExecuteTime(new Date());
                     }
                     if(r.needExecuteImmediate()){
                         new Thread(r).start();
                     }else {
                         r.run();
                     }
                     if(debug){
                         r.setFinishTime(new Date());
                     }
                 }catch(Exception e){
                   e.printStackTrace();
                 }
                 isWaiting=true;
                 r=null;
             }
         }
        }
    }
}
