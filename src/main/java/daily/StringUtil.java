package daily;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-8
 * Time: 下午10:08
 * To change this template use File | Settings | File Templates.
 */
public class StringUtil {
    public static void main(String[] args){
         String str="abcdef";
         reverseString(str);
    }
    public static void reverseString(String str){
        for(int i=str.length()-1;i>=0;i--){
           System.out.print(str.substring(i,i+1));
        }
    }
}
