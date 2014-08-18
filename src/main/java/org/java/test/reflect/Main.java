package org.java.test.reflect;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-15
 * Time: 下午4:34
 * To change this template use File | Settings | File Templates.
 */
public class Main {
      public static void main(String[] args){
          try{
              Class c=Class.forName("org.java.Test.reflectTest.BmwCar");
              ICar iCar=(ICar)c.newInstance();
              iCar.run();
          }catch (Exception e){
              e.printStackTrace();
          }
      }
}
