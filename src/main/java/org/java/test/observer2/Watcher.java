package org.java.test.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午6:39
 * To change this template use File | Settings | File Templates.
 */
public class Watcher implements Observer{

    @Override
    public void update(Observable arg0, Object arg1) {
            System.out.println((Integer)arg1);
    }
}
