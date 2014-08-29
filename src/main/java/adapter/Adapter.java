package adapter;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-24
 * Time: 上午10:01
 * To change this template use File | Settings | File Templates.
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void get220v() {
        System.out.println("这是220v");
    }
}
