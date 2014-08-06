package interceptor;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-1
 * Time: 下午1:52
 * To change this template use File | Settings | File Templates.
 */
public class BusinessClass implements BusinessInterface{

    @Override
    public void doSomething() {
        System.out.println("业务组件BusinessClass方法调用:doSomething()");
    }
}
