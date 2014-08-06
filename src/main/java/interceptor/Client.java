package interceptor;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-1
 * Time: 下午2:03
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args){
        DynamicProxyHandler handler=new DynamicProxyHandler();
        BusinessInterface business=new BusinessClass();
        BusinessInterface businessProxy=(BusinessInterface)handler.bind(business);
        businessProxy.doSomething();
    }
}
