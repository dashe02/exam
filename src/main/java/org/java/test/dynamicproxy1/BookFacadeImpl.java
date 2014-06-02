package org.java.test.dynamicproxy1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午6:56
 * To change this template use File | Settings | File Templates.
 */
public class BookFacadeImpl implements BookFacade{
    public void deleteBook(){
         System.out.println("正在删除图书...");
    }
}
