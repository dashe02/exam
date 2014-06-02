package org.java.test.dynaminproxy2;

import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-4
 * Time: 下午6:39
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        Class[] proxyInterface=new Class[]{IBusiness.class,IBusiness2.class};
        LogInvocationHandler handler=new LogInvocationHandler(new Business());
        ClassLoader classLoader=Main.class.getClassLoader();
        IBusiness2 proxyBusiness= (IBusiness2)Proxy.newProxyInstance(classLoader,proxyInterface,handler);
        proxyBusiness.doSomeThing2();
        ((IBusiness)proxyBusiness).doSomeThing();
    }
}
