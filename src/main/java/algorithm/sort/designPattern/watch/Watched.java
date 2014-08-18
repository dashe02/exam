package algorithm.sort.designPattern.watch;

import java.util.Observable;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午11:36
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
