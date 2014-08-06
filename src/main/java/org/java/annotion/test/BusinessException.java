package org.java.annotion.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午9:00
 * To change this template use File | Settings | File Templates.
 */
public class BusinessException extends Throwable{

    public BusinessException() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public BusinessException(String message) {
        super(message);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public BusinessException(String message, Throwable throwable) {
        super(message, throwable);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public BusinessException(Throwable throwable) {
        super(throwable);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
