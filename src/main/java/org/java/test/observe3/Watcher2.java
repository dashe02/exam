package org.java.test.observe3;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午5:10
 * To change this template use File | Settings | File Templates.
 */
public class Watcher2 implements Observer{
    @Override
    public void update(Observable arg0, Object arg1) {
        if((Integer)arg1==0){
            System.out.println("done");
        }
    }
}
