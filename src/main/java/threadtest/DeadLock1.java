package threadtest;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午4:23
 * To change this template use File | Settings | File Templates.
 */
public class DeadLock1 implements Runnable{
     public int flag=1;
     static Object o1=new Object(),o2=new Object();

     public void run(){
         System.out.println("flag"+flag);
         if(flag==1){
         synchronized (o1){
             try{
                Thread.sleep(500);
             }catch(Exception e){
                 e.printStackTrace();
             }
             synchronized (o2){
                 System.out.println("1");
             }
         }
         }
         if(flag==0){
         synchronized (o2){
             try{
                Thread.sleep(500);
             }catch(Exception e){
                 e.printStackTrace();
             }
             synchronized (o1){
                 System.out.println("0");
             }
         }
         }
     }
       public static void main(String[] args){
           DeadLock1 td1=new DeadLock1();
           DeadLock1 td2=new DeadLock1();
           td1.flag=1;
           td2.flag=0;
           new Thread(td1).start();
           new Thread(td2).start();
       }
}
