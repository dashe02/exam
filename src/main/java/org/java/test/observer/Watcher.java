package org.java.test.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午9:14
 * To change this template use File | Settings | File Templates.
 * 第一个观察者
 */
public class Watcher implements Observer {

    public void update(Observable arg0,Object arg1){
        System.out.println("Watcher");
        System.out.println((Integer)arg1);
    }


}
