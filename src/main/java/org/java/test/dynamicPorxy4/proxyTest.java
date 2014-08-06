package org.java.test.dynamicPorxy4;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午5:06
 * To change this template use File | Settings | File Templates.
 */
public class proxyTest {
    public static void main(String[] args){
        ICarProxy proxy=new ICarProxy();
        ICar iCarProxy=(ICar)proxy.bind(new AudiCar());
        iCarProxy.start();
        iCarProxy.run();
        iCarProxy.stop();
    }
}
