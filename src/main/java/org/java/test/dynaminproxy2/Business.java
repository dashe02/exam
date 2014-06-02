package org.java.test.dynaminproxy2;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-4
 * Time: 下午6:26
 * To change this template use File | Settings | File Templates.
 */
public class Business implements IBusiness,IBusiness2{

    @Override
    public boolean doSomeThing() {
        System.out.println("执行业务逻辑");
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void doSomeThing2() {
        System.out.println("执行业务逻辑2");
    }
}
