package org.java.test.dynamicproxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午6:58
 * To change this template use File | Settings | File Templates.
 */
public class BookFacadeProxy implements InvocationHandler {
    private Object target;
    public Object bind(Object target){
       this.target=target;
       return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    public Object invoke(Object proxy,Method method,Object[]args)throws Throwable{
           Object result=null;
           System.out.println("事物开始");
           result=method.invoke(target,args);
           System.out.println("事物结束");
           return result;
    }
}
