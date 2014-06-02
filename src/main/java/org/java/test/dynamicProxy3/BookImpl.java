package org.java.test.dynamicProxy3;

import javax.comm.PortInUseException;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午4:45
 * To change this template use File | Settings | File Templates.
 */
public class BookImpl implements IBook{

    public void borrowBook(){
        System.out.println("借书");
    }
    public void returnBook(){
        System.out.println("还书");
    }
}
