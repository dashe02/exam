package exception.utils;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午7:07
 * To change this template use File | Settings | File Templates.
 */
public final class Exceptions {

    private Exceptions(){
        throw new Error("Utility classes should not instantiated!");
    }

    public static RuntimeException unchecked(Exception e){
        if(e instanceof RuntimeException){
            return (RuntimeException)e;
        }else {
            return new RuntimeException(e);
        }
    }
    public static String getStackTraceAsString(Exception e){
        StringWriter stringWriter=new StringWriter();
        e.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
    public static boolean isCauseBy(Exception ex,Class<? extends Exception>... causeExceptionCalsses){
        Throwable cause=ex.getCause();
        while(cause!=null){
            for(Class<? extends Exception> causeClass:causeExceptionCalsses){
                if(causeClass.isInstance(cause)){
                    return true;
                }
            }
            cause=cause.getCause();
        }
        return false;
    }
}
