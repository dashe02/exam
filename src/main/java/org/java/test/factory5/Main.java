package org.java.test.factory5;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午4:21
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        ICarFactory bmwCarFactory=new BmwCarFactory();
        ICarFactory audiCarFactory=new AudiCarFactory();
        ICar bmwCar=bmwCarFactory.choseCar();
        ICar audiCar=audiCarFactory.choseCar();
        bmwCar.start();
        bmwCar.run();
        bmwCar.stop();
        audiCar.start();
        audiCar.run();
        audiCar.stop();
    }
}
