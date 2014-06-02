package org.java.test.factory3;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午4:16
 * To change this template use File | Settings | File Templates.
 */
public class BmwCar implements ICar{

    @Override
    public void doCar() {
        System.out.println("我是宝马！");
    }
}
