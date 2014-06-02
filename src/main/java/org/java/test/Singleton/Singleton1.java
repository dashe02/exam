package org.java.test.Singleton;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */
public class Singleton1 {
    private Singleton1 singleton1=null;

    public Singleton1(){

    }
    public Singleton1 getInstance(){
        if(singleton1==null){
            synchronized (singleton1)
            {
                if(singleton1==null){
                    singleton1=new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
