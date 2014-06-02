package org.java.test.factory3;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午4:21
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        ICarFactory bmw=new BmwCarFactory();
        ICarFactory audi=new AodiCarFactory();
        ICar bmwCar=bmw.createCar();
        ICar audiCar=audi.createCar();
        bmwCar.doCar();
        audiCar.doCar();
    }
}
