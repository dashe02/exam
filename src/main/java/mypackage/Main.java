package mypackage;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-23
 * Time: 下午8:01
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        DataHandler handler=new DataHandler();
        Thread[] ts=new Thread[]{
                new ReadThread(handler),
                new ReadThread(handler),
                new ReadThread(handler),
                new ReadThread(handler),
                new ReadThread(handler),
                new WriteThread(handler),
                new WriteThread(handler)
        };
        for(int i=0;i<ts.length;i++){
            ts[i].start();
        }
    }
}
