package org.java.test.factory5;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午4:18
 * To change this template use File | Settings | File Templates.
 */
public class BmwCarFactory implements ICarFactory{

    @Override
    public ICar choseCar() {
        return new BmwCar();
    }
}
