package algorithm.sort.first;

import sun.reflect.generics.scope.MethodScope;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午8:22
 * To change this template use File | Settings | File Templates.
 */
public class SortProxy implements InvocationHandler{
    private Object target;
    public Object bind(Object target){
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        int[] a={1,4,6,8,0,2};
        result=method.invoke(target,args);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        return result;
    }
}
