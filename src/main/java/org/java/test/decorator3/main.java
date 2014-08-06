package org.java.test.decorator3;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-1
 * Time: 上午12:33
 * To change this template use File | Settings | File Templates.
 */
public class main {
    public static void main(String[] args){
        ICar iCar=new Car();
        ICar decorator1=new Decorator1(iCar);
        ICar decorator2=new Decorator2(decorator1);
        System.out.println(decorator2.start());
    }
}
