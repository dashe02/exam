package org.java.test.observer2;

import java.util.Observable;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午6:39
 * To change this template use File | Settings | File Templates.
 */
public class Watched extends Observable{

      public void count(int number){
          for(;number>=0;number--){
              setChanged();
              notifyObservers(number);
          }
      }
}
