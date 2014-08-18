package algorithm.sort.designPattern.watch;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午11:43
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        Watched watched=new Watched();
        Watcher1 watcher1=new Watcher1();
        Watcher2 watcher2=new Watcher2();
        watched.addObserver(watcher1);
        watched.addObserver(watcher2);
        watched.count(10);
    }
}
