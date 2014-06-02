package org.java.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午5:30
 * To change this template use File | Settings | File Templates.
 */
public class Publish extends Thread{
    private PublicResource publicResource;
    public Publish(PublicResource publicResource){
        this.publicResource=publicResource;
    }
    public void run(){
        try{
            Thread.sleep((long)Math.random()*10);
        }catch (Exception e){
            e.printStackTrace();
        }
        publicResource.add();
    }
}
