package org.java.test.observe3;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午5:13
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        Watched watched=new Watched();
        Watcher watcher=new Watcher();
        Watcher2 watcher2=new Watcher2();
        watched.addObserver(watcher);
        watched.addObserver(watcher2);
        watched.count(10);
    }
}
