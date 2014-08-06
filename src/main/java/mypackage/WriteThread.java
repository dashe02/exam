package mypackage;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-23
 * Time: 下午7:57
 * To change this template use File | Settings | File Templates.
 */
public class WriteThread extends Thread{

    private DataHandler handler;

    public WriteThread(DataHandler handler){
        this.handler=handler;
    }
    public void run(){
        char[] data=new char[10];
        for(;;){
            try{
                fill(data);
                handler.write(getName(),data);
                Thread.sleep((long)(Math.random()*1000+100));
            }catch(InterruptedException e){
                break;
            }
        }
    }
    //产生一个A-Z随机字符,填入char[10]
    private void fill(char[] data){
        char c=(char)(Math.random()*26+'A');
        for(int i=0;i<data.length;i++)
            data[i]=c;
    }



}
