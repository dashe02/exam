package org.java.test.factory6;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午4:30
 * To change this template use File | Settings | File Templates.
 */
public class BmwCar implements ICar{

    @Override
    public void start() {
       System.out.println("宝马启动...");
    }

    @Override
    public void run() {
        System.out.println("宝马正在跑...");
    }

    @Override
    public void stop() {
        System.out.print("宝马停止...");
    }
}
