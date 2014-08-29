package exception;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午7:27
 * To change this template use File | Settings | File Templates.
 */
public class DuplicateException extends RuntimeException{
        private static final long serialVersionUID=-322684921370765557L;

    public DuplicateException(String message) {
        super(message);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public DuplicateException(String message, Throwable throwable) {
        super(message, throwable);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public DuplicateException(Throwable throwable) {
        super(throwable);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public DuplicateException() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
