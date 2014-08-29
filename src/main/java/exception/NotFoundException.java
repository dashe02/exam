package exception;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午7:33
 * To change this template use File | Settings | File Templates.
 */
public class NotFoundException extends RuntimeException{
        private final static long serialVersionUID=-322684921370765557L;

    public NotFoundException() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public NotFoundException(String message) {
        super(message);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public NotFoundException(String message, Throwable throwable) {
        super(message, throwable);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public NotFoundException(Throwable throwable) {
        super(throwable);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
