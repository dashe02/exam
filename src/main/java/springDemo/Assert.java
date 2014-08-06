package springDemo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-31
 * Time: 上午8:00
 * To change this template use File | Settings | File Templates.
 */
public class Assert {
    public void isNull(Object object,String  message){
        if(object==null){
              throw new IllegalArgumentException(message);
        }
    }
    public static boolean hasLength(CharSequence str){
        return (str!=null&&str.length()>0);
    }
}
