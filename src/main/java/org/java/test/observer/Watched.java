package org.java.test.observer;

import java.util.Observable;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午9:12
 * To change this template use File | Settings | File Templates.
 */
public class Watched extends Observable {
     //被观察者
     public void count(int number){
         for(;number>=0;number--){
             setChanged();
             notifyObservers(number);
         }
     }


}
