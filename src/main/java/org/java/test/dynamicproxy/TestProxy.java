package org.java.test.dynamicproxy;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午6:52
 * To change this template use File | Settings | File Templates.
 */
public class TestProxy {
    public static void main(String[] args){
        BookFacedeProxy proxy=new BookFacedeProxy();
        BookFacade bookProxy=(BookFacade)proxy.bind(new BookFacedeImpl());
        bookProxy.addBook();
    }
}
