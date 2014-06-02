package org.java.test.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午9:15
 * To change this template use File | Settings | File Templates.
 * 第二个观察者
 */
public class Watcher2 implements Observer {
    public void update(Observable arg0,Object arg1){
        System.out.println("Watcher2");
        if((Integer)arg1==0){
            System.out.println("done");
        }
    }
}
