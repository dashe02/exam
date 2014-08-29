package string;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午3:49
 * To change this template use File | Settings | File Templates.
 */
public class StringTest {
     public static void quzifu(String str,String s){
         System.out.println(str.replace(s,""));
     }

     public static void main(String[] args){
          String str="abcdecabd";
          String s="a";
          quzifu(str,s);
     }
}
