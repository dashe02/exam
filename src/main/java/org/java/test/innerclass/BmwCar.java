package org.java.test.innerclass;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-28
 * Time: 下午7:30
 * To change this template use File | Settings | File Templates.
 */
public class BmwCar{
    public static void main(String[] args){
         ICar iCar=new ICar() {
             @Override
             public void start() {
                 System.out.println("宝马飞驰!");
             }
         };
         iCar.start();
    }
}
