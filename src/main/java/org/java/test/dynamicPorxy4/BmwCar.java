package org.java.test.dynamicPorxy4;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午4:58
 * To change this template use File | Settings | File Templates.
 */
public class BmwCar implements ICar{

    public void start(){
        System.out.println("宝马发动了...");
    }

    public void run(){
        System.out.println("宝马正在飞驰...");
    }

    public void stop(){
        System.out.println("宝马停下了...");
    }


}
