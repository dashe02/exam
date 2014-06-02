package org.java.test.dynamicProxy3;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午4:54
 * To change this template use File | Settings | File Templates.
 */
public class ProxyTest {
    public static void main(String[] args){
        BookProxy proxy=new BookProxy();
        IBook bookproxy=(IBook)proxy.bind(new BookImpl());
        bookproxy.borrowBook();
    }
}
