package algorithm.sort.designPattern.watch;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午11:42
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
