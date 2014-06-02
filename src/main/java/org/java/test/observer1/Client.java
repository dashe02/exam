package org.java.test.observer1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午9:35
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args){
        Watched watched=new Watched();
        Watcher watcher=new Watcher();
        Watcher2 watcher2=new Watcher2();
        watched.addObserver(watcher);
        watched.addObserver(watcher2);
        watched.count(10);
    }
}
