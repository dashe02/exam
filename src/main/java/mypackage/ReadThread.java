package mypackage;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-23
 * Time: 下午7:51
 * To change this template use File | Settings | File Templates.
 */
public class ReadThread extends Thread{
    private DataHandler handler;
    public ReadThread(DataHandler handler){
        this.handler=handler;
    }
    public void run(){
         for(;;){
             try{
              char[] data=handler.read(getName());
                 Thread.sleep((long)(Math.random()*1000+100));
             }catch(InterruptedException e){
                 break;
             }
         }
    }
}
