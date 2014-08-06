package org.java.test.factory6;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午4:49
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        ICarFactory factory=new ICarFactory();
        ICar car=factory.getObject("Bmw");
        car.start();
        car.run();
        car.stop();
    }
}
