package exception;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午7:07
 * To change this template use File | Settings | File Templates.
 */
public class BusinessException extends RuntimeException{

      private static final long serialVersionUID=-6569214816469303340L;

    public BusinessException(String message) {
        super(message);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public BusinessException(String message, Throwable throwable) {
        super(message, throwable);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public BusinessException(Throwable throwable) {
        super(throwable);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public BusinessException() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
