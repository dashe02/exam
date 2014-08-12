package cal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-10
 * Time: 上午10:48
 * To change this template use File | Settings | File Templates.
 */
public class TestProxy implements InvocationHandler{
    private Object target;

    public Object bind(Object target){
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        long t1=System.currentTimeMillis();
        result=method.invoke(target, args);
        long t2=System.currentTimeMillis();
        System.out.println(method.getName()+"消耗时间"+(t2-t1));
        return result;
    }
}
