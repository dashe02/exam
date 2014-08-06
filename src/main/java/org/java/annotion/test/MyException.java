package org.java.annotion.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午8:57
 * To change this template use File | Settings | File Templates.
 */
public class MyException extends Exception{
    public MyException() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public MyException(String message) {
        super(message);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public MyException(String message, Throwable throwable) {
        super(message, throwable);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public MyException(Throwable throwable) {
        super(throwable);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
