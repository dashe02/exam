package algorithm.sort.designPattern.factory;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午11:31
 * To change this template use File | Settings | File Templates.
 */
public class AudiCar implements ICar{

    @Override
    public void start() {
        System.out.println("奥迪开始跑!");
    }
}
