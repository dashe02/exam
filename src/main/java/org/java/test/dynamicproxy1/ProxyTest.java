package org.java.test.dynamicproxy1;

import org.java.test.dynamicproxy.BookFacedeImpl;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午7:07
 * To change this template use File | Settings | File Templates.
 */
public class ProxyTest {
    public static void main(String[] args){
         BookFacadeProxy proxy=new BookFacadeProxy();
         BookFacade bookproxy=(BookFacade)proxy.bind(new BookFacedeImpl());
         bookproxy.deleteBook();
    }
}
