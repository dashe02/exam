package org.java.test.dynamicPorxy4;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午4:06
 * To change this template use File | Settings | File Templates.
 */
public class AudiCar implements ICar{
    @Override
    public void start() {
    System.out.println("奥迪在启动...");
    }


    @Override
    public void run() {
        System.out.println("奥迪正在运行...");
    }

    @Override
    public void stop() {
        System.out.println("奥迪已停车...");
    }
}
