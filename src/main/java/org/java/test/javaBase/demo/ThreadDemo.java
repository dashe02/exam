package org.java.test.javaBase.demo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-24
 * Time: 下午3:07
 * To change this template use File | Settings | File Templates.
 */
public class ThreadDemo extends Thread{

    public void run(){
        try{
           wait();
        }catch (Exception e){
            e.printStackTrace();
        }
        notify();
    }
}
