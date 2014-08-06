package interceptor;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-1
 * Time: 下午1:54
 * To change this template use File | Settings | File Templates.
 */
public class InterceptorClass {
   public void before(){
       System.out.println("拦截器InterceptorClass方法调用:before()");
   }
   public void after(){
       System.out.println("拦截器InterceptorClass方法调用:after()");
   }
}
