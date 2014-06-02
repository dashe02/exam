package org.java.test.Singleton;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午4:07
 * To change this template use File | Settings | File Templates.
 */
public class Singleton {
    private Singleton singleton=null;
    public Singleton getInstance(){
        if(singleton==null){
            synchronized(singleton){
               singleton=new Singleton();
        }
        }
        return singleton;
    }
}
