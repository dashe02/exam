package org.java.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午5:52
 * To change this template use File | Settings | File Templates.
 */
public class Consume extends Thread{
    private PublicResource publicResource;
    public Consume(PublicResource publicResource){
        this.publicResource=publicResource;
    }
    public void run(){
      try{
          publicResource.minus();
        }catch (Exception e){
          e.printStackTrace();
      }
        publicResource.minus();
    }
}
