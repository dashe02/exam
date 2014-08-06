package thread;

import com.sun.org.apache.xml.internal.utils.SerializableLocatorImpl;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-25
 * Time: 上午10:13
 * To change this template use File | Settings | File Templates.
 */
public class MyThread extends Thread{
    private String name;
    public MyThread(String name){
        this.name=name;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(name + "" + i);
        }
    }
    public static void main(String[] args){
        MyThread myThread=new MyThread("god");
        MyThread myThread1=new MyThread("hah");
        myThread.start();
        myThread1.start();
    }
}
