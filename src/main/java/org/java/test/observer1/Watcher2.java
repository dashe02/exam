package org.java.test.observer1;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午9:33
 * To change this template use File | Settings | File Templates.
 */
public class Watcher2 implements Observer {

     public void update(Observable arg0,Object arg1){
          if((Integer)arg1==0){
              System.out.println("done");
          }
     }
}
