package org.java.test.factory6;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午4:40
 * To change this template use File | Settings | File Templates.
 */
public class AudiCar implements ICar{
    @Override
    public void start() {
        System.out.println("奥迪启动...");
    }

    @Override
    public void run() {
        System.out.println("奥迪运行...");
    }

    @Override
    public void stop() {
        System.out.println("奥迪停止...");
    }
}
