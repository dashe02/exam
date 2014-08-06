package org.java.test.factory6;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午4:42
 * To change this template use File | Settings | File Templates.
 */
public class ICarFactory {
    public ICar getObject(String car){
        if(car.equals("Bmw")){
            return new BmwCar();
        }else if(car.equals("Audi")){
            return new AudiCar();
        }
        return null;
    }
}
