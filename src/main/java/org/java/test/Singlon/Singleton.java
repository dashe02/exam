package org.java.test.Singlon;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午4:54
 * To change this template use File | Settings | File Templates.
 */
public class Singleton {
    private static Singleton singleton=null;
    private Singleton(){

    }
    public static synchronized Singleton getSingleton(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
