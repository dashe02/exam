package springDemo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-31
 * Time: 上午7:38
 * To change this template use File | Settings | File Templates.
 */
public class MyException extends RuntimeException{

        public MyException(){
            super();
        }

        public MyException(String message){
            super(message);
        }

        public MyException(String message,Throwable throwable){
            super(message,throwable);
        }

        public MyException(Throwable throwable){
            super(throwable);
        }

}
