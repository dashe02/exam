package org.java.test.decorator3;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-1
 * Time: 上午12:32
 * To change this template use File | Settings | File Templates.
 */
public class Decorator2 implements ICar{

    private ICar iCar;

    public Decorator2(ICar iCar){
        this.iCar=iCar;
    }

    @Override
    public String start() {
        return "##2"+iCar.start()+"##2";  //To change body of implemented methods use File | Settings | File Templates.
    }
}
