package org.java.test.factory3;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午4:19
 * To change this template use File | Settings | File Templates.
 */
public class BmwCarFactory implements ICarFactory{

      public ICar createCar(){
           return new BmwCar();
      }
}
