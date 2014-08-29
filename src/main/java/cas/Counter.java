package cas;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 上午11:01
 * To change this template use File | Settings | File Templates.
 */
public final class Counter {

    private  long value=0;

    public synchronized long getValue(){
        return value;
    }

    public synchronized long increment(){
        return ++value;
    }
}
