package interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-1
 * Time: 下午1:57
 * To change this template use File | Settings | File Templates.
 */
public class DynamicProxyHandler implements InvocationHandler{

    private Object business; //被代理对象

    private InterceptorClass interceptor=new InterceptorClass();  //拦截器

    /*
    * 动态生成一个代理类对象,并绑定被代理类和代理处理器
    */
    public Object bind(Object business){
        this.business=business;
        return Proxy.newProxyInstance(business.getClass().getClassLoader(),business.getClass().getInterfaces()
        ,this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        interceptor.before();
        result=method.invoke(business,args);
        interceptor.after();
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
