package reflectTest;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 下午4:23
 * To change this template use File | Settings | File Templates.
 */
public class BmwCar implements ICar{

    @Override
    public void start() {
        System.out.println("宝马启动!");
    }
}
