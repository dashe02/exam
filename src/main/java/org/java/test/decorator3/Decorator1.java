package org.java.test.decorator3;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-1
 * Time: 上午12:29
 * To change this template use File | Settings | File Templates.
 */
public class Decorator1 implements ICar{

       private  ICar iCar;

       public Decorator1(ICar iCar){
           this.iCar=iCar;
       }

    @Override
    public String start() {
        return "##1"+iCar.start()+"##1";  //To change body of implemented methods use File | Settings | File Templates.
    }
}
