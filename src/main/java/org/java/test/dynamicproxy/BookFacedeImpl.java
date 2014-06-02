package org.java.test.dynamicproxy;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午6:42
 * To change this template use File | Settings | File Templates.
 */
public class BookFacedeImpl implements BookFacade{

    public void addBook(){
       System.out.print("添加图书方法....");
    }
}
