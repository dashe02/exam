package algorithm.sort.designPattern.factory;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午11:34
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        CarFactory carFactory=new CarFactory();
        ICar car=carFactory.getCar("bmw");
        car.start();
    }
}
