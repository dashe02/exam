package spring;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 下午10:30
 * To change this template use File | Settings | File Templates.
 */
public class BmwCar implements ICar{
    @Override
    public void run() {
       System.out.println("Bmw Car runs");
    }
}
