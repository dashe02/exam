package org.java.test.dynaminproxy2;

import java.awt.event.InvocationEvent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-4
 * Time: 下午6:29
 * To change this template use File | Settings | File Templates.
 */
public class LogInvocationHandler implements InvocationHandler{

    private Object target;

    public LogInvocationHandler(Object target){
        this.target=target;
    }

      public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
          Object rev=method.invoke(target,args);
          if(method.getName().equals("doSomeThing2")){
              System.out.println("记录日志");
          }
           return rev;
      }
}
